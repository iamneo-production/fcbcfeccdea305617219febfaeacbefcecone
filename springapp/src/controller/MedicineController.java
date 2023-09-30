@RestController
public class MedicineController{
    private final List<Medicine> medicines = new ArrayList<>();
    @PostMapping("/medicines")
    public boolean addMedicine(@RequestBody Medicine medicine){
        return medicines.add(medicine);
    }
    @PutMapping("/medicines/{medicineId}")
    public ResponseEntity<Medicine>
    updateMedicine(@PathVariable int medicineId,@RequestBody Medicine updateMedicine){
        for(int i=0;i<medicines.size();i++){
            Medicine medicine = medicines.get(i);
            if(medicine.getMedicineId() == medicineId){
                medicines.set(i,updatedMedicine);
                return ResponseEntity.ok(updatedMedicine);
            }
        }
        return ResponseEntity.notFound().build();
    }
}