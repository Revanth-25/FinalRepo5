using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace OrdersListWeb.Migrations
{
    /// <inheritdoc />
    public partial class FinalUpdate : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.RenameColumn(
                name: "ReferenceNumber",
                table: "OrdersList",
                newName: "OrderNumber");

            migrationBuilder.RenameColumn(
                name: "OrderId",
                table: "OrdersList",
                newName: "Id");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.RenameColumn(
                name: "OrderNumber",
                table: "OrdersList",
                newName: "ReferenceNumber");

            migrationBuilder.RenameColumn(
                name: "Id",
                table: "OrdersList",
                newName: "OrderId");
        }
    }
}
