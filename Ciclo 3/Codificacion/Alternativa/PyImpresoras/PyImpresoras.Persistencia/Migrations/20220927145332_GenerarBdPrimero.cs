using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace PyImpresoras.Persistencia.Migrations
{
    public partial class GenerarBdPrimero : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Personas",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Email = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Login = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Password = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Nombre = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Apellido = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    NumeroTelefono = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Discriminator = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    AuxiliarId = table.Column<int>(type: "int", nullable: true),
                    RazonSocial = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    Socio_AuxiliarId = table.Column<int>(type: "int", nullable: true),
                    Direccion = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    Ciudad = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    Tecnico_AuxiliarId = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Personas", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Personas_Personas_AuxiliarId",
                        column: x => x.AuxiliarId,
                        principalTable: "Personas",
                        principalColumn: "Id");
                    table.ForeignKey(
                        name: "FK_Personas_Personas_Socio_AuxiliarId",
                        column: x => x.Socio_AuxiliarId,
                        principalTable: "Personas",
                        principalColumn: "Id");
                    table.ForeignKey(
                        name: "FK_Personas_Personas_Tecnico_AuxiliarId",
                        column: x => x.Tecnico_AuxiliarId,
                        principalTable: "Personas",
                        principalColumn: "Id");
                });

            migrationBuilder.CreateTable(
                name: "Asignaciones",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    AuxiliarId = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Asignaciones", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Asignaciones_Personas_AuxiliarId",
                        column: x => x.AuxiliarId,
                        principalTable: "Personas",
                        principalColumn: "Id");
                });

            migrationBuilder.CreateTable(
                name: "Seguros",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    FechaCompra = table.Column<DateTime>(type: "datetime2", nullable: false),
                    FechaVencimiento = table.Column<DateTime>(type: "datetime2", nullable: false),
                    JefeOperacionId = table.Column<int>(type: "int", nullable: true),
                    OperadorId = table.Column<int>(type: "int", nullable: true),
                    SocioId = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Seguros", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Seguros_Personas_JefeOperacionId",
                        column: x => x.JefeOperacionId,
                        principalTable: "Personas",
                        principalColumn: "Id");
                    table.ForeignKey(
                        name: "FK_Seguros_Personas_OperadorId",
                        column: x => x.OperadorId,
                        principalTable: "Personas",
                        principalColumn: "Id");
                    table.ForeignKey(
                        name: "FK_Seguros_Personas_SocioId",
                        column: x => x.SocioId,
                        principalTable: "Personas",
                        principalColumn: "Id");
                });

            migrationBuilder.CreateTable(
                name: "TiposEstudios",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    TipoDeEstudio = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    TecnicoId = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_TiposEstudios", x => x.Id);
                    table.ForeignKey(
                        name: "FK_TiposEstudios_Personas_TecnicoId",
                        column: x => x.TecnicoId,
                        principalTable: "Personas",
                        principalColumn: "Id");
                });

            migrationBuilder.CreateTable(
                name: "AsignacionesOperadores",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    AsignacionId = table.Column<int>(type: "int", nullable: false),
                    OperadorId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_AsignacionesOperadores", x => x.Id);
                    table.ForeignKey(
                        name: "FK_AsignacionesOperadores_Asignaciones_AsignacionId",
                        column: x => x.AsignacionId,
                        principalTable: "Asignaciones",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_AsignacionesOperadores_Personas_OperadorId",
                        column: x => x.OperadorId,
                        principalTable: "Personas",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "AsignacionesTecnicos",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    AsignacionId = table.Column<int>(type: "int", nullable: false),
                    TecnicoId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_AsignacionesTecnicos", x => x.Id);
                    table.ForeignKey(
                        name: "FK_AsignacionesTecnicos_Asignaciones_AsignacionId",
                        column: x => x.AsignacionId,
                        principalTable: "Asignaciones",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_AsignacionesTecnicos_Personas_TecnicoId",
                        column: x => x.TecnicoId,
                        principalTable: "Personas",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "Impresoras",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    PlacaImpresora = table.Column<int>(type: "int", nullable: false),
                    Marca = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Anio = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VelocidadImpresion = table.Column<double>(type: "float", nullable: false),
                    PaisOrigen = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SeguroId = table.Column<int>(type: "int", nullable: false),
                    AuxiliarId = table.Column<int>(type: "int", nullable: true),
                    JefeOperacionId = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Impresoras", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Impresoras_Personas_AuxiliarId",
                        column: x => x.AuxiliarId,
                        principalTable: "Personas",
                        principalColumn: "Id");
                    table.ForeignKey(
                        name: "FK_Impresoras_Personas_JefeOperacionId",
                        column: x => x.JefeOperacionId,
                        principalTable: "Personas",
                        principalColumn: "Id");
                    table.ForeignKey(
                        name: "FK_Impresoras_Seguros_SeguroId",
                        column: x => x.SeguroId,
                        principalTable: "Seguros",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "TiposSeguros",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    TipoDeSeguro = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SeguroId = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_TiposSeguros", x => x.Id);
                    table.ForeignKey(
                        name: "FK_TiposSeguros_Seguros_SeguroId",
                        column: x => x.SeguroId,
                        principalTable: "Seguros",
                        principalColumn: "Id");
                });

            migrationBuilder.CreateTable(
                name: "AsignacionesImpresoras",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    AsignacionId = table.Column<int>(type: "int", nullable: false),
                    ImpresoraId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_AsignacionesImpresoras", x => x.Id);
                    table.ForeignKey(
                        name: "FK_AsignacionesImpresoras_Asignaciones_AsignacionId",
                        column: x => x.AsignacionId,
                        principalTable: "Asignaciones",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_AsignacionesImpresoras_Impresoras_ImpresoraId",
                        column: x => x.ImpresoraId,
                        principalTable: "Impresoras",
                        principalColumn: "Id",
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
                    FechaHora = table.Column<DateTime>(type: "datetime2", nullable: false),
                    ImpresoraId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Revisiones", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Revisiones_Impresoras_ImpresoraId",
                        column: x => x.ImpresoraId,
                        principalTable: "Impresoras",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "TiposImpresoras",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Tipo = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    ImpresoraId = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_TiposImpresoras", x => x.Id);
                    table.ForeignKey(
                        name: "FK_TiposImpresoras_Impresoras_ImpresoraId",
                        column: x => x.ImpresoraId,
                        principalTable: "Impresoras",
                        principalColumn: "Id");
                });

            migrationBuilder.CreateTable(
                name: "HistorialRevisiones",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Valor = table.Column<int>(type: "int", nullable: false),
                    FechaHora = table.Column<DateTime>(type: "datetime2", nullable: false),
                    RevisionId = table.Column<int>(type: "int", nullable: false),
                    JefeOperacionId = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_HistorialRevisiones", x => x.Id);
                    table.ForeignKey(
                        name: "FK_HistorialRevisiones_Personas_JefeOperacionId",
                        column: x => x.JefeOperacionId,
                        principalTable: "Personas",
                        principalColumn: "Id");
                    table.ForeignKey(
                        name: "FK_HistorialRevisiones_Revisiones_RevisionId",
                        column: x => x.RevisionId,
                        principalTable: "Revisiones",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "TipoRevisiones",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    TipoDeRevision = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    RevisionId = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_TipoRevisiones", x => x.Id);
                    table.ForeignKey(
                        name: "FK_TipoRevisiones_Revisiones_RevisionId",
                        column: x => x.RevisionId,
                        principalTable: "Revisiones",
                        principalColumn: "Id");
                });

            migrationBuilder.CreateIndex(
                name: "IX_Asignaciones_AuxiliarId",
                table: "Asignaciones",
                column: "AuxiliarId");

            migrationBuilder.CreateIndex(
                name: "IX_AsignacionesImpresoras_AsignacionId",
                table: "AsignacionesImpresoras",
                column: "AsignacionId");

            migrationBuilder.CreateIndex(
                name: "IX_AsignacionesImpresoras_ImpresoraId",
                table: "AsignacionesImpresoras",
                column: "ImpresoraId");

            migrationBuilder.CreateIndex(
                name: "IX_AsignacionesOperadores_AsignacionId",
                table: "AsignacionesOperadores",
                column: "AsignacionId");

            migrationBuilder.CreateIndex(
                name: "IX_AsignacionesOperadores_OperadorId",
                table: "AsignacionesOperadores",
                column: "OperadorId");

            migrationBuilder.CreateIndex(
                name: "IX_AsignacionesTecnicos_AsignacionId",
                table: "AsignacionesTecnicos",
                column: "AsignacionId");

            migrationBuilder.CreateIndex(
                name: "IX_AsignacionesTecnicos_TecnicoId",
                table: "AsignacionesTecnicos",
                column: "TecnicoId");

            migrationBuilder.CreateIndex(
                name: "IX_HistorialRevisiones_JefeOperacionId",
                table: "HistorialRevisiones",
                column: "JefeOperacionId");

            migrationBuilder.CreateIndex(
                name: "IX_HistorialRevisiones_RevisionId",
                table: "HistorialRevisiones",
                column: "RevisionId");

            migrationBuilder.CreateIndex(
                name: "IX_Impresoras_AuxiliarId",
                table: "Impresoras",
                column: "AuxiliarId");

            migrationBuilder.CreateIndex(
                name: "IX_Impresoras_JefeOperacionId",
                table: "Impresoras",
                column: "JefeOperacionId");

            migrationBuilder.CreateIndex(
                name: "IX_Impresoras_SeguroId",
                table: "Impresoras",
                column: "SeguroId");

            migrationBuilder.CreateIndex(
                name: "IX_Personas_AuxiliarId",
                table: "Personas",
                column: "AuxiliarId");

            migrationBuilder.CreateIndex(
                name: "IX_Personas_Socio_AuxiliarId",
                table: "Personas",
                column: "Socio_AuxiliarId");

            migrationBuilder.CreateIndex(
                name: "IX_Personas_Tecnico_AuxiliarId",
                table: "Personas",
                column: "Tecnico_AuxiliarId");

            migrationBuilder.CreateIndex(
                name: "IX_Revisiones_ImpresoraId",
                table: "Revisiones",
                column: "ImpresoraId");

            migrationBuilder.CreateIndex(
                name: "IX_Seguros_JefeOperacionId",
                table: "Seguros",
                column: "JefeOperacionId");

            migrationBuilder.CreateIndex(
                name: "IX_Seguros_OperadorId",
                table: "Seguros",
                column: "OperadorId");

            migrationBuilder.CreateIndex(
                name: "IX_Seguros_SocioId",
                table: "Seguros",
                column: "SocioId");

            migrationBuilder.CreateIndex(
                name: "IX_TipoRevisiones_RevisionId",
                table: "TipoRevisiones",
                column: "RevisionId");

            migrationBuilder.CreateIndex(
                name: "IX_TiposEstudios_TecnicoId",
                table: "TiposEstudios",
                column: "TecnicoId");

            migrationBuilder.CreateIndex(
                name: "IX_TiposImpresoras_ImpresoraId",
                table: "TiposImpresoras",
                column: "ImpresoraId");

            migrationBuilder.CreateIndex(
                name: "IX_TiposSeguros_SeguroId",
                table: "TiposSeguros",
                column: "SeguroId");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "AsignacionesImpresoras");

            migrationBuilder.DropTable(
                name: "AsignacionesOperadores");

            migrationBuilder.DropTable(
                name: "AsignacionesTecnicos");

            migrationBuilder.DropTable(
                name: "HistorialRevisiones");

            migrationBuilder.DropTable(
                name: "TipoRevisiones");

            migrationBuilder.DropTable(
                name: "TiposEstudios");

            migrationBuilder.DropTable(
                name: "TiposImpresoras");

            migrationBuilder.DropTable(
                name: "TiposSeguros");

            migrationBuilder.DropTable(
                name: "Asignaciones");

            migrationBuilder.DropTable(
                name: "Revisiones");

            migrationBuilder.DropTable(
                name: "Impresoras");

            migrationBuilder.DropTable(
                name: "Seguros");

            migrationBuilder.DropTable(
                name: "Personas");
        }
    }
}
