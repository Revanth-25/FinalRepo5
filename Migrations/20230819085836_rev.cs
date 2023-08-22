using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace OrdersListWeb.Migrations
{
    /// <inheritdoc />
    public partial class rev : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropPrimaryKey(
                name: "PK_OrdersLists",
                table: "OrdersList");

            migrationBuilder.RenameTable(
                name: "OrdersList",
                newName: "OrdersList");

            migrationBuilder.RenameColumn(
                name: "DisplayOrder",
                table: "OrdersList",
                newName: "ReferenceNumber");

            migrationBuilder.AddPrimaryKey(
                name: "PK_OrdersLists",
                table: "OrdersList",
                column: "OrderId");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropPrimaryKey(
                name: "PK_OrdersLists",
                table: "OrdersList");

            migrationBuilder.RenameTable(
                name: "OrdersList",
                newName: "OrdersList");

            migrationBuilder.RenameColumn(
                name: "ReferenceNumber",
                table: "OrdersList",
                newName: "DisplayOrder");

            migrationBuilder.AddPrimaryKey(
                name: "PK_OrdersLists",
                table: "OrdersList",
                column: "OrderId");
        }
    }
}
