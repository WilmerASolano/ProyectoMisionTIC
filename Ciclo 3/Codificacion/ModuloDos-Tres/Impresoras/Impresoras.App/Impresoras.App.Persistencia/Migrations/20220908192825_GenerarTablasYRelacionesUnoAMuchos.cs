using Microsoft.EntityFrameworkCore.Migrations;

namespace Impresoras.App.Persistencia.Migrations
{
    public partial class GenerarTablasYRelacionesUnoAMuchos : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Asignaciones_Personas_AuxiliarId",
                table: "Asignaciones");

            migrationBuilder.DropForeignKey(
                name: "FK_Asignaciones_Personas_PersonaId",
                table: "Asignaciones");

            migrationBuilder.DropForeignKey(
                name: "FK_Impresoras_Personas_AuxiliarId",
                table: "Impresoras");

            migrationBuilder.DropForeignKey(
                name: "FK_Impresoras_Personas_PersonaId",
                table: "Impresoras");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_AuxiliarId",
                table: "Personas");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_Socio_AuxiliarId",
                table: "Personas");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_Socio_PersonaId",
                table: "Personas");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_Tecnico_AuxiliarId",
                table: "Personas");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_Tecnico_PersonaId",
                table: "Personas");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_TecnicoId",
                table: "Personas");

            migrationBuilder.DropForeignKey(
                name: "FK_Seguros_Personas_OperarioId",
                table: "Seguros");

            migrationBuilder.DropIndex(
                name: "IX_Seguros_OperarioId",
                table: "Seguros");

            migrationBuilder.DropIndex(
                name: "IX_Personas_AuxiliarId",
                table: "Personas");

            migrationBuilder.DropIndex(
                name: "IX_Personas_Socio_AuxiliarId",
                table: "Personas");

            migrationBuilder.DropIndex(
                name: "IX_Personas_Socio_PersonaId",
                table: "Personas");

            migrationBuilder.DropIndex(
                name: "IX_Personas_Tecnico_AuxiliarId",
                table: "Personas");

            migrationBuilder.DropIndex(
                name: "IX_Personas_Tecnico_PersonaId",
                table: "Personas");

            migrationBuilder.DropIndex(
                name: "IX_Personas_TecnicoId",
                table: "Personas");

            migrationBuilder.DropIndex(
                name: "IX_Impresoras_AuxiliarId",
                table: "Impresoras");

            migrationBuilder.DropIndex(
                name: "IX_Asignaciones_AuxiliarId",
                table: "Asignaciones");

            migrationBuilder.DropColumn(
                name: "OperarioId",
                table: "Seguros");

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
                name: "IdPersona",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "JefeId",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "Socio_AuxiliarId",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "Socio_PersonaId",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "TecnicoId",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "Tecnico_AuxiliarId",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "Tecnico_IdPersona",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "Tecnico_PersonaId",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "AuxiliarId",
                table: "Impresoras");

            migrationBuilder.DropColumn(
                name: "IdPersona",
                table: "Impresoras");

            migrationBuilder.DropColumn(
                name: "AuxiliarId",
                table: "Asignaciones");

            migrationBuilder.DropColumn(
                name: "IdPersona",
                table: "Asignaciones");

            migrationBuilder.AlterColumn<int>(
                name: "PersonaId",
                table: "Impresoras",
                type: "int",
                nullable: false,
                defaultValue: 0,
                oldClrType: typeof(int),
                oldType: "int",
                oldNullable: true);

            migrationBuilder.AddColumn<int>(
                name: "RevisionId",
                table: "HistorialRevisiones",
                type: "int",
                nullable: true);

            migrationBuilder.AlterColumn<int>(
                name: "PersonaId",
                table: "Asignaciones",
                type: "int",
                nullable: false,
                defaultValue: 0,
                oldClrType: typeof(int),
                oldType: "int",
                oldNullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_HistorialRevisiones_RevisionId",
                table: "HistorialRevisiones",
                column: "RevisionId");

            migrationBuilder.AddForeignKey(
                name: "FK_Asignaciones_Personas_PersonaId",
                table: "Asignaciones",
                column: "PersonaId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_HistorialRevisiones_Revisiones_RevisionId",
                table: "HistorialRevisiones",
                column: "RevisionId",
                principalTable: "Revisiones",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Impresoras_Personas_PersonaId",
                table: "Impresoras",
                column: "PersonaId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Asignaciones_Personas_PersonaId",
                table: "Asignaciones");

            migrationBuilder.DropForeignKey(
                name: "FK_HistorialRevisiones_Revisiones_RevisionId",
                table: "HistorialRevisiones");

            migrationBuilder.DropForeignKey(
                name: "FK_Impresoras_Personas_PersonaId",
                table: "Impresoras");

            migrationBuilder.DropIndex(
                name: "IX_HistorialRevisiones_RevisionId",
                table: "HistorialRevisiones");

            migrationBuilder.DropColumn(
                name: "RevisionId",
                table: "HistorialRevisiones");

            migrationBuilder.AddColumn<int>(
                name: "OperarioId",
                table: "Seguros",
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
                name: "IdPersona",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "JefeId",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "Socio_AuxiliarId",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "Socio_PersonaId",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "TecnicoId",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "Tecnico_AuxiliarId",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "Tecnico_IdPersona",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "Tecnico_PersonaId",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AlterColumn<int>(
                name: "PersonaId",
                table: "Impresoras",
                type: "int",
                nullable: true,
                oldClrType: typeof(int),
                oldType: "int");

            migrationBuilder.AddColumn<int>(
                name: "AuxiliarId",
                table: "Impresoras",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "IdPersona",
                table: "Impresoras",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AlterColumn<int>(
                name: "PersonaId",
                table: "Asignaciones",
                type: "int",
                nullable: true,
                oldClrType: typeof(int),
                oldType: "int");

            migrationBuilder.AddColumn<int>(
                name: "AuxiliarId",
                table: "Asignaciones",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "IdPersona",
                table: "Asignaciones",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.CreateIndex(
                name: "IX_Seguros_OperarioId",
                table: "Seguros",
                column: "OperarioId");

            migrationBuilder.CreateIndex(
                name: "IX_Personas_AuxiliarId",
                table: "Personas",
                column: "AuxiliarId");

            migrationBuilder.CreateIndex(
                name: "IX_Personas_Socio_AuxiliarId",
                table: "Personas",
                column: "Socio_AuxiliarId");

            migrationBuilder.CreateIndex(
                name: "IX_Personas_Socio_PersonaId",
                table: "Personas",
                column: "Socio_PersonaId");

            migrationBuilder.CreateIndex(
                name: "IX_Personas_Tecnico_AuxiliarId",
                table: "Personas",
                column: "Tecnico_AuxiliarId");

            migrationBuilder.CreateIndex(
                name: "IX_Personas_Tecnico_PersonaId",
                table: "Personas",
                column: "Tecnico_PersonaId");

            migrationBuilder.CreateIndex(
                name: "IX_Personas_TecnicoId",
                table: "Personas",
                column: "TecnicoId");

            migrationBuilder.CreateIndex(
                name: "IX_Impresoras_AuxiliarId",
                table: "Impresoras",
                column: "AuxiliarId");

            migrationBuilder.CreateIndex(
                name: "IX_Asignaciones_AuxiliarId",
                table: "Asignaciones",
                column: "AuxiliarId");

            migrationBuilder.AddForeignKey(
                name: "FK_Asignaciones_Personas_AuxiliarId",
                table: "Asignaciones",
                column: "AuxiliarId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Asignaciones_Personas_PersonaId",
                table: "Asignaciones",
                column: "PersonaId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Impresoras_Personas_AuxiliarId",
                table: "Impresoras",
                column: "AuxiliarId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Impresoras_Personas_PersonaId",
                table: "Impresoras",
                column: "PersonaId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_AuxiliarId",
                table: "Personas",
                column: "AuxiliarId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_Socio_AuxiliarId",
                table: "Personas",
                column: "Socio_AuxiliarId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_Socio_PersonaId",
                table: "Personas",
                column: "Socio_PersonaId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_Tecnico_AuxiliarId",
                table: "Personas",
                column: "Tecnico_AuxiliarId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_Tecnico_PersonaId",
                table: "Personas",
                column: "Tecnico_PersonaId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_TecnicoId",
                table: "Personas",
                column: "TecnicoId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Seguros_Personas_OperarioId",
                table: "Seguros",
                column: "OperarioId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);
        }
    }
}
