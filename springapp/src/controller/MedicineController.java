@RestController
public class MedicineController{
    private final List<Medicine> medicines = new ArrayList<>();
    @PostMapping("/medicines")
    public boolean addMedicine(@RequestBody Medicine medicine){
        return medicines.add(medicine);
    }
    @PutMapping("/medicines")
}