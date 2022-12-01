using Microsoft.EntityFrameworkCore.Migrations;

namespace Impresoras.App.Persistencia.Migrations
{
    public partial class GenerandoTablasYRelacionesUnoAMuchos : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Asignaciones_Personas_AuxiliarId",
                table: "Asignaciones");

            migrationBuilder.DropForeignKey(
                name: "FK_Impresoras_Personas_AuxiliarId",
                table: "Impresoras");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_Socio_AuxiliarId",
                table: "Personas");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_Tecnico_AuxiliarId",
                table: "Personas");

            migrationBuilder.AddColumn<int>(
                name: "IdPersona",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "Socio_PersonaId",
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
                name: "AuxiliarId",
                table: "Impresoras",
                type: "int",
                nullable: true,
                oldClrType: typeof(int),
                oldType: "int");

            migrationBuilder.AddColumn<int>(
                name: "IdPersona",
                table: "Impresoras",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AddColumn<int>(
                name: "PersonaId",
                table: "Impresoras",
                type: "int",
                nullable: true);

            migrationBuilder.AlterColumn<int>(
                name: "AuxiliarId",
                table: "Asignaciones",
                type: "int",
                nullable: true,
                oldClrType: typeof(int),
                oldType: "int");

            migrationBuilder.AddColumn<int>(
                name: "IdPersona",
                table: "Asignaciones",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AddColumn<int>(
                name: "PersonaId",
                table: "Asignaciones",
                type: "int",
                nullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Personas_Socio_PersonaId",
                table: "Personas",
                column: "Socio_PersonaId");

            migrationBuilder.CreateIndex(
                name: "IX_Personas_Tecnico_PersonaId",
                table: "Personas",
                column: "Tecnico_PersonaId");

            migrationBuilder.CreateIndex(
                name: "IX_Impresoras_PersonaId",
                table: "Impresoras",
                column: "PersonaId");

            migrationBuilder.CreateIndex(
                name: "IX_Asignaciones_PersonaId",
                table: "Asignaciones",
                column: "PersonaId");

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
        }

        protected override void Down(MigrationBuilder migrationBuilder)
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

            migrationBuilder.DropIndex(
                name: "IX_Personas_Socio_PersonaId",
                table: "Personas");

            migrationBuilder.DropIndex(
                name: "IX_Personas_Tecnico_PersonaId",
                table: "Personas");

            migrationBuilder.DropIndex(
                name: "IX_Impresoras_PersonaId",
                table: "Impresoras");

            migrationBuilder.DropIndex(
                name: "IX_Asignaciones_PersonaId",
                table: "Asignaciones");

            migrationBuilder.DropColumn(
                name: "IdPersona",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "Socio_PersonaId",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "Tecnico_IdPersona",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "Tecnico_PersonaId",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "IdPersona",
                table: "Impresoras");

            migrationBuilder.DropColumn(
                name: "PersonaId",
                table: "Impresoras");

            migrationBuilder.DropColumn(
                name: "IdPersona",
                table: "Asignaciones");

            migrationBuilder.DropColumn(
                name: "PersonaId",
                table: "Asignaciones");

            migrationBuilder.AlterColumn<int>(
                name: "AuxiliarId",
                table: "Impresoras",
                type: "int",
                nullable: false,
                defaultValue: 0,
                oldClrType: typeof(int),
                oldType: "int",
                oldNullable: true);

            migrationBuilder.AlterColumn<int>(
                name: "AuxiliarId",
                table: "Asignaciones",
                type: "int",
                nullable: false,
                defaultValue: 0,
                oldClrType: typeof(int),
                oldType: "int",
                oldNullable: true);

            migrationBuilder.AddForeignKey(
                name: "FK_Asignaciones_Personas_AuxiliarId",
                table: "Asignaciones",
                column: "AuxiliarId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Impresoras_Personas_AuxiliarId",
                table: "Impresoras",
                column: "AuxiliarId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_Socio_AuxiliarId",
                table: "Personas",
                column: "Socio_AuxiliarId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_Tecnico_AuxiliarId",
                table: "Personas",
                column: "Tecnico_AuxiliarId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
