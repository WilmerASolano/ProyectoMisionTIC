using Microsoft.EntityFrameworkCore.Migrations;

namespace Impresoras.App.Persistencia.Migrations
{
    public partial class Inicial : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "TipoImpresoras",
                columns: table => new
                {
                    ID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Tipo = table.Column<string>(type: "nvarchar(max)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_TipoImpresoras", x => x.ID);
                });

            migrationBuilder.CreateTable(
                name: "TipoSeguros",
                columns: table => new
                {
                    ID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    TipoDeSeguro = table.Column<string>(type: "nvarchar(max)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_TipoSeguros", x => x.ID);
                });

            migrationBuilder.CreateTable(
                name: "Impresoras",
                columns: table => new
                {
                    ID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    PlacaImpresoraID = table.Column<int>(type: "int", nullable: true),
                    TipoImpresoraID = table.Column<int>(type: "int", nullable: true),
                    Marca = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Anio = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VelocidadImpresion = table.Column<double>(type: "float", nullable: false),
                    PaisOrigen = table.Column<string>(type: "nvarchar(max)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Impresoras", x => x.ID);
                    table.ForeignKey(
                        name: "FK_Impresoras_Impresoras_PlacaImpresoraID",
                        column: x => x.PlacaImpresoraID,
                        principalTable: "Impresoras",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Restrict);
                    table.ForeignKey(
                        name: "FK_Impresoras_TipoImpresoras_TipoImpresoraID",
                        column: x => x.TipoImpresoraID,
                        principalTable: "TipoImpresoras",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Restrict);
                });

            migrationBuilder.CreateTable(
                name: "Seguros",
                columns: table => new
                {
                    ID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    PlacaImpresoraID = table.Column<int>(type: "int", nullable: true),
                    TipoID = table.Column<int>(type: "int", nullable: true),
                    FechaCompra = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    FechaVencimiento = table.Column<string>(type: "nvarchar(max)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Seguros", x => x.ID);
                    table.ForeignKey(
                        name: "FK_Seguros_Impresoras_PlacaImpresoraID",
                        column: x => x.PlacaImpresoraID,
                        principalTable: "Impresoras",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Restrict);
                    table.ForeignKey(
                        name: "FK_Seguros_TipoSeguros_TipoID",
                        column: x => x.TipoID,
                        principalTable: "TipoSeguros",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Restrict);
                });

            migrationBuilder.CreateTable(
                name: "Usuarios",
                columns: table => new
                {
                    ID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Email = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Login = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Password = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Discriminator = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Nombre = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    Apellido = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    RazonSocial = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    SeguroID = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Usuarios", x => x.ID);
                    table.ForeignKey(
                        name: "FK_Usuarios_Seguros_SeguroID",
                        column: x => x.SeguroID,
                        principalTable: "Seguros",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Restrict);
                });

            migrationBuilder.CreateIndex(
                name: "IX_Impresoras_PlacaImpresoraID",
                table: "Impresoras",
                column: "PlacaImpresoraID");

            migrationBuilder.CreateIndex(
                name: "IX_Impresoras_TipoImpresoraID",
                table: "Impresoras",
                column: "TipoImpresoraID");

            migrationBuilder.CreateIndex(
                name: "IX_Seguros_PlacaImpresoraID",
                table: "Seguros",
                column: "PlacaImpresoraID");

            migrationBuilder.CreateIndex(
                name: "IX_Seguros_TipoID",
                table: "Seguros",
                column: "TipoID");

            migrationBuilder.CreateIndex(
                name: "IX_Usuarios_SeguroID",
                table: "Usuarios",
                column: "SeguroID");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Usuarios");

            migrationBuilder.DropTable(
                name: "Seguros");

            migrationBuilder.DropTable(
                name: "Impresoras");

            migrationBuilder.DropTable(
                name: "TipoSeguros");

            migrationBuilder.DropTable(
                name: "TipoImpresoras");
        }
    }
}
