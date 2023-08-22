using Microsoft.AspNetCore.Mvc;
using OrdersListWeb.Data;
using OrdersListWeb.Models;

namespace OrdersListWeb.Controllers
{
    public class OrdersController : Controller
    {
        private readonly ApplicationDbContext _db;
        public OrdersController(ApplicationDbContext db)
        {
            _db = db;
        }
        public IActionResult Index()
        {
            IEnumerable<OrdersList> objOrdersList = _db.OrdersList;
            return View(objOrdersList);
        }

        //GET
        public IActionResult Create()
        {
            return View();
        }

        //POST
        [HttpPost]
        [ValidateAntiForgeryToken]
        public IActionResult Create(OrdersList obj)
        {
            if (obj.Name == obj.OrderNumber.ToString())
            {
                ModelState.AddModelError("name", "The DisplayOrder cannot exactly match the Name.");
            }
            if (ModelState.IsValid)
            {
                _db.OrdersList.Add(obj);
                _db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(obj);
        }
    }
}
