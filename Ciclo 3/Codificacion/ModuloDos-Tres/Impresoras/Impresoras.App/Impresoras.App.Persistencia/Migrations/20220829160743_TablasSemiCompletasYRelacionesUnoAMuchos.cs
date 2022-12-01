using System;
using Microsoft.EntityFrameworkCore.Migrations;

namespace Impresoras.App.Persistencia.Migrations
{
    public partial class TablasSemiCompletasYRelacionesUnoAMuchos : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Impresoras_Impresoras_PlacaImpresoraID",
                table: "Impresoras");

            migrationBuilder.DropForeignKey(
                name: "FK_Impresoras_TipoImpresoras_TipoImpresoraID",
                table: "Impresoras");

            migrationBuilder.DropForeignKey(
                name: "FK_Seguros_Impresoras_PlacaImpresoraID",
                table: "Seguros");

            migrationBuilder.DropForeignKey(
                name: "FK_Seguros_TipoSeguros_TipoID",
                table: "Seguros");

            migrationBuilder.DropForeignKey(
                name: "FK_Usuarios_Seguros_SeguroID",
                table: "Usuarios");

            migrationBuilder.DropIndex(
                name: "IX_Impresoras_PlacaImpresoraID",
                table: "Impresoras");

            migrationBuilder.DropPrimaryKey(
                name: "PK_Usuarios",
                table: "Usuarios");

            migrationBuilder.DropColumn(
                name: "PlacaImpresoraID",
                table: "Impresoras");

            migrationBuilder.RenameTable(
                name: "Usuarios",
                newName: "Personas");

            migrationBuilder.RenameColumn(
                name: "ID",
                table: "TipoSeguros",
                newName: "Id");

            migrationBuilder.RenameColumn(
                name: "ID",
                table: "TipoImpresoras",
                newName: "Id");

            migrationBuilder.RenameColumn(
                name: "PlacaImpresoraID",
                table: "Seguros",
                newName: "PlacaImpresoraId");

            migrationBuilder.RenameColumn(
                name: "ID",
                table: "Seguros",
                newName: "Id");

            migrationBuilder.RenameColumn(
                name: "TipoID",
                table: "Seguros",
                newName: "OperarioID");

            migrationBuilder.RenameIndex(
                name: "IX_Seguros_PlacaImpresoraID",
                table: "Seguros",
                newName: "IX_Seguros_PlacaImpresoraId");

            migrationBuilder.RenameIndex(
                name: "IX_Seguros_TipoID",
                table: "Seguros",
                newName: "IX_Seguros_OperarioID");

            migrationBuilder.RenameColumn(
                name: "ID",
                table: "Impresoras",
                newName: "Id");

            migrationBuilder.RenameColumn(
                name: "TipoImpresoraID",
                table: "Impresoras",
                newName: "JefeOperacionesID");

            migrationBuilder.RenameIndex(
                name: "IX_Impresoras_TipoImpresoraID",
                table: "Impresoras",
                newName: "IX_Impresoras_JefeOperacionesID");

            migrationBuilder.RenameColumn(
                name: "SeguroID",
                table: "Personas",
                newName: "Tecnico_AuxiliarID");

            migrationBuilder.RenameIndex(
                name: "IX_Usuarios_SeguroID",
                table: "Personas",
                newName: "IX_Personas_Tecnico_AuxiliarID");

            migrationBuilder.AddColumn<int>(
                name: "SeguroId",
                table: "TipoSeguros",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AddColumn<int>(
                name: "ImpresoraId",
                table: "TipoImpresoras",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AlterColumn<DateTime>(
                name: "FechaVencimiento",
                table: "Seguros",
                type: "datetime2",
                nullable: false,
                oldClrType: typeof(string),
                oldType: "nvarchar(max)");

            migrationBuilder.AlterColumn<DateTime>(
                name: "FechaCompra",
                table: "Seguros",
                type: "datetime2",
                nullable: false,
                oldClrType: typeof(string),
                oldType: "nvarchar(max)");

            migrationBuilder.AddColumn<int>(
                name: "JefeOperacionesID",
                table: "Seguros",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "SocioId",
                table: "Seguros",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AddColumn<int>(
                name: "AuxiliarId",
                table: "Impresoras",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AddColumn<int>(
                name: "PlacaImpresora",
                table: "Impresoras",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AlterColumn<string>(
                name: "Nombre",
                table: "Personas",
                type: "nvarchar(max)",
                nullable: false,
                defaultValue: "",
                oldClrType: typeof(string),
                oldType: "nvarchar(max)",
                oldNullable: true);

            migrationBuilder.AlterColumn<string>(
                name: "Apellido",
                table: "Personas",
                type: "nvarchar(max)",
                nullable: false,
                defaultValue: "",
                oldClrType: typeof(string),
                oldType: "nvarchar(max)",
                oldNullable: true);

            migrationBuilder.AddColumn<int>(
                name: "AuxiliarID",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "AuxiliarId",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<string>(
                name: "Ciudad",
                table: "Personas",
                type: "nvarchar(max)",
                nullable: true);

            migrationBuilder.AddColumn<string>(
                name: "Direccion",
                table: "Personas",
                type: "nvarchar(max)",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "JefeId",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<string>(
                name: "NumeroTelefono",
                table: "Personas",
                type: "nvarchar(max)",
                nullable: false,
                defaultValue: "");

            migrationBuilder.AddColumn<int>(
                name: "TecnicoID",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AddPrimaryKey(
                name: "PK_Personas",
                table: "Personas",
                column: "ID");

            migrationBuilder.CreateTable(
                name: "Asignaciones",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    PersonaId = table.Column<int>(type: "int", nullable: false),
                    AuxiliarID = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Asignaciones", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Asignaciones_Personas_AuxiliarID",
                        column: x => x.AuxiliarID,
                        principalTable: "Personas",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Restrict);
                    table.ForeignKey(
                        name: "FK_Asignaciones_Personas_PersonaId",
                        column: x => x.PersonaId,
                        principalTable: "Personas",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "HistorialRevisiones",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Valor = table.Column<int>(type: "int", nullable: false),
                    FechaHora = table.Column<DateTime>(type: "datetime2", nullable: false),
                    JefeId = table.Column<int>(type: "int", nullable: false),
                    JefeOperacionesID = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_HistorialRevisiones", x => x.Id);
                    table.ForeignKey(
                        name: "FK_HistorialRevisiones_Personas_JefeOperacionesID",
                        column: x => x.JefeOperacionesID,
                        principalTable: "Personas",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "Revisiones",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    EstadoCabezal = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    EstadoExtrusor = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Voltaje = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Alineacion = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    FechaHora = table.Column<DateTime>(type: "datetime2", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Revisiones", x => x.Id);
                });

            migrationBuilder.CreateTable(
                name: "TipoRevisiones",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    TipoDeRevision = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HistorialId = table.Column<int>(type: "int", nullable: false),
                    HistorialRevisionId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_TipoRevisiones", x => x.Id);
                    table.ForeignKey(
                        name: "FK_TipoRevisiones_HistorialRevisiones_HistorialRevisionId",
                        column: x => x.HistorialRevisionId,
                        principalTable: "HistorialRevisiones",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_TipoSeguros_SeguroId",
                table: "TipoSeguros",
                column: "SeguroId");

            migrationBuilder.CreateIndex(
                name: "IX_TipoImpresoras_ImpresoraId",
                table: "TipoImpresoras",
                column: "ImpresoraId");

            migrationBuilder.CreateIndex(
                name: "IX_Seguros_JefeOperacionesID",
                table: "Seguros",
                column: "JefeOperacionesID");

            migrationBuilder.CreateIndex(
                name: "IX_Seguros_SocioId",
                table: "Seguros",
                column: "SocioId");

            migrationBuilder.CreateIndex(
                name: "IX_Impresoras_AuxiliarId",
                table: "Impresoras",
                column: "AuxiliarId");

            migrationBuilder.CreateIndex(
                name: "IX_Personas_AuxiliarId",
                table: "Personas",
                column: "AuxiliarId");

            migrationBuilder.CreateIndex(
                name: "IX_Personas_AuxiliarID",
                table: "Personas",
                column: "AuxiliarID");

            migrationBuilder.CreateIndex(
                name: "IX_Personas_TecnicoID",
                table: "Personas",
                column: "TecnicoID");

            migrationBuilder.CreateIndex(
                name: "IX_Asignaciones_AuxiliarID",
                table: "Asignaciones",
                column: "AuxiliarID");

            migrationBuilder.CreateIndex(
                name: "IX_Asignaciones_PersonaId",
                table: "Asignaciones",
                column: "PersonaId");

            migrationBuilder.CreateIndex(
                name: "IX_HistorialRevisiones_JefeOperacionesID",
                table: "HistorialRevisiones",
                column: "JefeOperacionesID");

            migrationBuilder.CreateIndex(
                name: "IX_TipoRevisiones_HistorialRevisionId",
                table: "TipoRevisiones",
                column: "HistorialRevisionId");

            migrationBuilder.AddForeignKey(
                name: "FK_Impresoras_Personas_AuxiliarId",
                table: "Impresoras",
                column: "AuxiliarId",
                principalTable: "Personas",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Impresoras_Personas_JefeOperacionesID",
                table: "Impresoras",
                column: "JefeOperacionesID",
                principalTable: "Personas",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_AuxiliarId",
                table: "Personas",
                column: "AuxiliarId",
                principalTable: "Personas",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_AuxiliarID",
                table: "Personas",
                column: "AuxiliarID",
                principalTable: "Personas",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_Tecnico_AuxiliarID",
                table: "Personas",
                column: "Tecnico_AuxiliarID",
                principalTable: "Personas",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_TecnicoID",
                table: "Personas",
                column: "TecnicoID",
                principalTable: "Personas",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Seguros_Impresoras_PlacaImpresoraId",
                table: "Seguros",
                column: "PlacaImpresoraId",
                principalTable: "Impresoras",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Seguros_Personas_JefeOperacionesID",
                table: "Seguros",
                column: "JefeOperacionesID",
                principalTable: "Personas",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Seguros_Personas_OperarioID",
                table: "Seguros",
                column: "OperarioID",
                principalTable: "Personas",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Seguros_Personas_SocioId",
                table: "Seguros",
                column: "SocioId",
                principalTable: "Personas",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_TipoImpresoras_Impresoras_ImpresoraId",
                table: "TipoImpresoras",
                column: "ImpresoraId",
                principalTable: "Impresoras",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_TipoSeguros_Seguros_SeguroId",
                table: "TipoSeguros",
                column: "SeguroId",
                principalTable: "Seguros",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Impresoras_Personas_AuxiliarId",
                table: "Impresoras");

            migrationBuilder.DropForeignKey(
                name: "FK_Impresoras_Personas_JefeOperacionesID",
                table: "Impresoras");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_AuxiliarId",
                table: "Personas");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_AuxiliarID",
                table: "Personas");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_Tecnico_AuxiliarID",
                table: "Personas");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_TecnicoID",
                table: "Personas");

            migrationBuilder.DropForeignKey(
                name: "FK_Seguros_Impresoras_PlacaImpresoraId",
                table: "Seguros");

            migrationBuilder.DropForeignKey(
                name: "FK_Seguros_Personas_JefeOperacionesID",
                table: "Seguros");

            migrationBuilder.DropForeignKey(
                name: "FK_Seguros_Personas_OperarioID",
                table: "Seguros");

            migrationBuilder.DropForeignKey(
                name: "FK_Seguros_Personas_SocioId",
                table: "Seguros");

            migrationBuilder.DropForeignKey(
                name: "FK_TipoImpresoras_Impresoras_ImpresoraId",
                table: "TipoImpresoras");

            migrationBuilder.DropForeignKey(
                name: "FK_TipoSeguros_Seguros_SeguroId",
                table: "TipoSeguros");

            migrationBuilder.DropTable(
                name: "Asignaciones");

            migrationBuilder.DropTable(
                name: "Revisiones");

            migrationBuilder.DropTable(
                name: "TipoRevisiones");

            migrationBuilder.DropTable(
                name: "HistorialRevisiones");

            migrationBuilder.DropIndex(
                name: "IX_TipoSeguros_SeguroId",
                table: "TipoSeguros");

            migrationBuilder.DropIndex(
                name: "IX_TipoImpresoras_ImpresoraId",
                table: "TipoImpresoras");

            migrationBuilder.DropIndex(
                name: "IX_Seguros_JefeOperacionesID",
                table: "Seguros");

            migrationBuilder.DropIndex(
                name: "IX_Seguros_SocioId",
                table: "Seguros");

            migrationBuilder.DropIndex(
                name: "IX_Impresoras_AuxiliarId",
                table: "Impresoras");

            migrationBuilder.DropPrimaryKey(
                name: "PK_Personas",
                table: "Personas");

            migrationBuilder.DropIndex(
                name: "IX_Personas_AuxiliarId",
                table: "Personas");

            migrationBuilder.DropIndex(
                name: "IX_Personas_AuxiliarID",
                table: "Personas");

            migrationBuilder.DropIndex(
                name: "IX_Personas_TecnicoID",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "SeguroId",
                table: "TipoSeguros");

            migrationBuilder.DropColumn(
                name: "ImpresoraId",
                table: "TipoImpresoras");

            migrationBuilder.DropColumn(
                name: "JefeOperacionesID",
                table: "Seguros");

            migrationBuilder.DropColumn(
                name: "SocioId",
                table: "Seguros");

            migrationBuilder.DropColumn(
                name: "AuxiliarId",
                table: "Impresoras");

            migrationBuilder.DropColumn(
                name: "PlacaImpresora",
                table: "Impresoras");

            migrationBuilder.DropColumn(
                name: "AuxiliarID",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "AuxiliarId",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "Ciudad",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "Direccion",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "JefeId",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "NumeroTelefono",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "TecnicoID",
                table: "Personas");

            migrationBuilder.RenameTable(
                name: "Personas",
                newName: "Usuarios");

            migrationBuilder.RenameColumn(
                name: "Id",
                table: "TipoSeguros",
                newName: "ID");

            migrationBuilder.RenameColumn(
                name: "Id",
                table: "TipoImpresoras",
                newName: "ID");

            migrationBuilder.RenameColumn(
                name: "PlacaImpresoraId",
                table: "Seguros",
                newName: "PlacaImpresoraID");

            migrationBuilder.RenameColumn(
                name: "Id",
                table: "Seguros",
                newName: "ID");

            migrationBuilder.RenameColumn(
                name: "OperarioID",
                table: "Seguros",
                newName: "TipoID");

            migrationBuilder.RenameIndex(
                name: "IX_Seguros_PlacaImpresoraId",
                table: "Seguros",
                newName: "IX_Seguros_PlacaImpresoraID");

            migrationBuilder.RenameIndex(
                name: "IX_Seguros_OperarioID",
                table: "Seguros",
                newName: "IX_Seguros_TipoID");

            migrationBuilder.RenameColumn(
                name: "Id",
                table: "Impresoras",
                newName: "ID");

            migrationBuilder.RenameColumn(
                name: "JefeOperacionesID",
                table: "Impresoras",
                newName: "TipoImpresoraID");

            migrationBuilder.RenameIndex(
                name: "IX_Impresoras_JefeOperacionesID",
                table: "Impresoras",
                newName: "IX_Impresoras_TipoImpresoraID");

            migrationBuilder.RenameColumn(
                name: "Tecnico_AuxiliarID",
                table: "Usuarios",
                newName: "SeguroID");

            migrationBuilder.RenameIndex(
                name: "IX_Personas_Tecnico_AuxiliarID",
                table: "Usuarios",
                newName: "IX_Usuarios_SeguroID");

            migrationBuilder.AlterColumn<string>(
                name: "FechaVencimiento",
                table: "Seguros",
                type: "nvarchar(max)",
                nullable: false,
                oldClrType: typeof(DateTime),
                oldType: "datetime2");

            migrationBuilder.AlterColumn<string>(
                name: "FechaCompra",
                table: "Seguros",
                type: "nvarchar(max)",
                nullable: false,
                oldClrType: typeof(DateTime),
                oldType: "datetime2");

            migrationBuilder.AddColumn<int>(
                name: "PlacaImpresoraID",
                table: "Impresoras",
                type: "int",
                nullable: true);

            migrationBuilder.AlterColumn<string>(
                name: "Nombre",
                table: "Usuarios",
                type: "nvarchar(max)",
                nullable: true,
                oldClrType: typeof(string),
                oldType: "nvarchar(max)");

            migrationBuilder.AlterColumn<string>(
                name: "Apellido",
                table: "Usuarios",
                type: "nvarchar(max)",
                nullable: true,
                oldClrType: typeof(string),
                oldType: "nvarchar(max)");

            migrationBuilder.AddPrimaryKey(
                name: "PK_Usuarios",
                table: "Usuarios",
                column: "ID");

            migrationBuilder.CreateIndex(
                name: "IX_Impresoras_PlacaImpresoraID",
                table: "Impresoras",
                column: "PlacaImpresoraID");

            migrationBuilder.AddForeignKey(
                name: "FK_Impresoras_Impresoras_PlacaImpresoraID",
                table: "Impresoras",
                column: "PlacaImpresoraID",
                principalTable: "Impresoras",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Impresoras_TipoImpresoras_TipoImpresoraID",
                table: "Impresoras",
                column: "TipoImpresoraID",
                principalTable: "TipoImpresoras",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Seguros_Impresoras_PlacaImpresoraID",
                table: "Seguros",
                column: "PlacaImpresoraID",
                principalTable: "Impresoras",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Seguros_TipoSeguros_TipoID",
                table: "Seguros",
                column: "TipoID",
                principalTable: "TipoSeguros",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Usuarios_Seguros_SeguroID",
                table: "Usuarios",
                column: "SeguroID",
                principalTable: "Seguros",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);
        }
    }
}
