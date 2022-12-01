using Microsoft.EntityFrameworkCore.Migrations;

namespace Impresoras.App.Persistencia.Migrations
{
    public partial class TablasSemiCompletasYRelacionesUnoAMuchosSegundaActualizacion : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Asignaciones_Personas_AuxiliarID",
                table: "Asignaciones");

            migrationBuilder.DropForeignKey(
                name: "FK_HistorialRevisiones_Personas_JefeOperacionesID",
                table: "HistorialRevisiones");

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
                name: "FK_Seguros_Personas_JefeOperacionesID",
                table: "Seguros");

            migrationBuilder.DropForeignKey(
                name: "FK_Seguros_Personas_OperarioID",
                table: "Seguros");

            migrationBuilder.RenameColumn(
                name: "OperarioID",
                table: "Seguros",
                newName: "OperarioId");

            migrationBuilder.RenameColumn(
                name: "JefeOperacionesID",
                table: "Seguros",
                newName: "JefeOperacionesId");

            migrationBuilder.RenameIndex(
                name: "IX_Seguros_OperarioID",
                table: "Seguros",
                newName: "IX_Seguros_OperarioId");

            migrationBuilder.RenameIndex(
                name: "IX_Seguros_JefeOperacionesID",
                table: "Seguros",
                newName: "IX_Seguros_JefeOperacionesId");

            migrationBuilder.RenameColumn(
                name: "Tecnico_AuxiliarID",
                table: "Personas",
                newName: "Tecnico_AuxiliarId");

            migrationBuilder.RenameColumn(
                name: "TecnicoID",
                table: "Personas",
                newName: "TecnicoId");

            migrationBuilder.RenameColumn(
                name: "ID",
                table: "Personas",
                newName: "Id");

            migrationBuilder.RenameColumn(
                name: "AuxiliarID",
                table: "Personas",
                newName: "Socio_AuxiliarId");

            migrationBuilder.RenameIndex(
                name: "IX_Personas_TecnicoID",
                table: "Personas",
                newName: "IX_Personas_TecnicoId");

            migrationBuilder.RenameIndex(
                name: "IX_Personas_Tecnico_AuxiliarID",
                table: "Personas",
                newName: "IX_Personas_Tecnico_AuxiliarId");

            migrationBuilder.RenameIndex(
                name: "IX_Personas_AuxiliarID",
                table: "Personas",
                newName: "IX_Personas_Socio_AuxiliarId");

            migrationBuilder.RenameColumn(
                name: "JefeOperacionesID",
                table: "Impresoras",
                newName: "JefeOperacionesId");

            migrationBuilder.RenameIndex(
                name: "IX_Impresoras_JefeOperacionesID",
                table: "Impresoras",
                newName: "IX_Impresoras_JefeOperacionesId");

            migrationBuilder.RenameColumn(
                name: "JefeOperacionesID",
                table: "HistorialRevisiones",
                newName: "JefeOperacionesId");

            migrationBuilder.RenameIndex(
                name: "IX_HistorialRevisiones_JefeOperacionesID",
                table: "HistorialRevisiones",
                newName: "IX_HistorialRevisiones_JefeOperacionesId");

            migrationBuilder.RenameColumn(
                name: "AuxiliarID",
                table: "Asignaciones",
                newName: "AuxiliarId");

            migrationBuilder.RenameIndex(
                name: "IX_Asignaciones_AuxiliarID",
                table: "Asignaciones",
                newName: "IX_Asignaciones_AuxiliarId");

            migrationBuilder.AddColumn<int>(
                name: "PersonaId",
                table: "Personas",
                type: "int",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "Socio_PersonaId",
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
                name: "PersonaId",
                table: "Impresoras",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.CreateIndex(
                name: "IX_Personas_PersonaId",
                table: "Personas",
                column: "PersonaId");

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

            migrationBuilder.AddForeignKey(
                name: "FK_Asignaciones_Personas_AuxiliarId",
                table: "Asignaciones",
                column: "AuxiliarId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_HistorialRevisiones_Personas_JefeOperacionesId",
                table: "HistorialRevisiones",
                column: "JefeOperacionesId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Impresoras_Personas_AuxiliarId",
                table: "Impresoras",
                column: "AuxiliarId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Impresoras_Personas_JefeOperacionesId",
                table: "Impresoras",
                column: "JefeOperacionesId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Impresoras_Personas_PersonaId",
                table: "Impresoras",
                column: "PersonaId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_AuxiliarId",
                table: "Personas",
                column: "AuxiliarId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_PersonaId",
                table: "Personas",
                column: "PersonaId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);

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
                onDelete: ReferentialAction.Cascade);

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
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Personas_Personas_TecnicoId",
                table: "Personas",
                column: "TecnicoId",
                principalTable: "Personas",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Seguros_Personas_JefeOperacionesId",
                table: "Seguros",
                column: "JefeOperacionesId",
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

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Asignaciones_Personas_AuxiliarId",
                table: "Asignaciones");

            migrationBuilder.DropForeignKey(
                name: "FK_HistorialRevisiones_Personas_JefeOperacionesId",
                table: "HistorialRevisiones");

            migrationBuilder.DropForeignKey(
                name: "FK_Impresoras_Personas_AuxiliarId",
                table: "Impresoras");

            migrationBuilder.DropForeignKey(
                name: "FK_Impresoras_Personas_JefeOperacionesId",
                table: "Impresoras");

            migrationBuilder.DropForeignKey(
                name: "FK_Impresoras_Personas_PersonaId",
                table: "Impresoras");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_AuxiliarId",
                table: "Personas");

            migrationBuilder.DropForeignKey(
                name: "FK_Personas_Personas_PersonaId",
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
                name: "FK_Seguros_Personas_JefeOperacionesId",
                table: "Seguros");

            migrationBuilder.DropForeignKey(
                name: "FK_Seguros_Personas_OperarioId",
                table: "Seguros");

            migrationBuilder.DropIndex(
                name: "IX_Personas_PersonaId",
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

            migrationBuilder.DropColumn(
                name: "PersonaId",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "Socio_PersonaId",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "Tecnico_PersonaId",
                table: "Personas");

            migrationBuilder.DropColumn(
                name: "PersonaId",
                table: "Impresoras");

            migrationBuilder.RenameColumn(
                name: "OperarioId",
                table: "Seguros",
                newName: "OperarioID");

            migrationBuilder.RenameColumn(
                name: "JefeOperacionesId",
                table: "Seguros",
                newName: "JefeOperacionesID");

            migrationBuilder.RenameIndex(
                name: "IX_Seguros_OperarioId",
                table: "Seguros",
                newName: "IX_Seguros_OperarioID");

            migrationBuilder.RenameIndex(
                name: "IX_Seguros_JefeOperacionesId",
                table: "Seguros",
                newName: "IX_Seguros_JefeOperacionesID");

            migrationBuilder.RenameColumn(
                name: "Tecnico_AuxiliarId",
                table: "Personas",
                newName: "Tecnico_AuxiliarID");

            migrationBuilder.RenameColumn(
                name: "TecnicoId",
                table: "Personas",
                newName: "TecnicoID");

            migrationBuilder.RenameColumn(
                name: "Id",
                table: "Personas",
                newName: "ID");

            migrationBuilder.RenameColumn(
                name: "Socio_AuxiliarId",
                table: "Personas",
                newName: "AuxiliarID");

            migrationBuilder.RenameIndex(
                name: "IX_Personas_TecnicoId",
                table: "Personas",
                newName: "IX_Personas_TecnicoID");

            migrationBuilder.RenameIndex(
                name: "IX_Personas_Tecnico_AuxiliarId",
                table: "Personas",
                newName: "IX_Personas_Tecnico_AuxiliarID");

            migrationBuilder.RenameIndex(
                name: "IX_Personas_Socio_AuxiliarId",
                table: "Personas",
                newName: "IX_Personas_AuxiliarID");

            migrationBuilder.RenameColumn(
                name: "JefeOperacionesId",
                table: "Impresoras",
                newName: "JefeOperacionesID");

            migrationBuilder.RenameIndex(
                name: "IX_Impresoras_JefeOperacionesId",
                table: "Impresoras",
                newName: "IX_Impresoras_JefeOperacionesID");

            migrationBuilder.RenameColumn(
                name: "JefeOperacionesId",
                table: "HistorialRevisiones",
                newName: "JefeOperacionesID");

            migrationBuilder.RenameIndex(
                name: "IX_HistorialRevisiones_JefeOperacionesId",
                table: "HistorialRevisiones",
                newName: "IX_HistorialRevisiones_JefeOperacionesID");

            migrationBuilder.RenameColumn(
                name: "AuxiliarId",
                table: "Asignaciones",
                newName: "AuxiliarID");

            migrationBuilder.RenameIndex(
                name: "IX_Asignaciones_AuxiliarId",
                table: "Asignaciones",
                newName: "IX_Asignaciones_AuxiliarID");

            migrationBuilder.AlterColumn<int>(
                name: "AuxiliarId",
                table: "Impresoras",
                type: "int",
                nullable: false,
                defaultValue: 0,
                oldClrType: typeof(int),
                oldType: "int",
                oldNullable: true);

            migrationBuilder.AddForeignKey(
                name: "FK_Asignaciones_Personas_AuxiliarID",
                table: "Asignaciones",
                column: "AuxiliarID",
                principalTable: "Personas",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_HistorialRevisiones_Personas_JefeOperacionesID",
                table: "HistorialRevisiones",
                column: "JefeOperacionesID",
                principalTable: "Personas",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

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
        }
    }
}
