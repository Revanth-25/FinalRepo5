using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

namespace OrdersListWeb.Models
{
    public class OrdersList
    {
        [Key]
        public int Id { get; set; }
        [Required]
        public string Name { get; set; }
        [DisplayName("Order Number")]
        [Range(1,10000,ErrorMessage ="Enter a valid Order Id!")]
        public int OrderNumber { get; set; }
        public DateTime CreatedDateTime { get; set; } = DateTime.Now;
    }
}
