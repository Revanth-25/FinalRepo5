using Microsoft.EntityFrameworkCore;
using OrdersListWeb.Models;

namespace OrdersListWeb.Data
{
    public class ApplicationDbContext : DbContext
    {
        public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options) : base(options)    
        {
                
        }

        public DbSet<OrdersList> OrdersList { get; set; }
    }
}
