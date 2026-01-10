package Bai08;
import java.util.*;


public class HeThong {
//    private ArrayList<MachDien> sys = new ArrayList<>();   //Should we use Arraylist?
    private HashMap<String , MachDien> sys = new HashMap<>();
    public MachDien findByName(String name)
    {
        if (sys.containsKey(name))
            return new MachDien(sys.get(name).name , sys.get(name).dienTro);
        return null;
    }
    public void addNewMachDien(String name, double dienTro)
    {
        MachDien md = findByName(name);
        if (md != null)
        {
            System.out.println("This name has been defined. Choose another");
            return;
        }
        sys.put(name , new MachDien(name , dienTro));
        System.out.println("Added...");
    }
    public void listAll()
    {
        for (Map.Entry<String , MachDien> entry : sys.entrySet())
            entry.getValue().output();
    }
    public void listByName(String name)
    {
        MachDien md = findByName(name);
        if (md == null)
        {
            System.out.println("Nothing here");
            return;
        }
        md.output();
    }
    public double seriesCircuit(String name1, String name2)  //Mach dien noi tiep
    {
        if (sys.containsKey(name1) && sys.containsKey(name2))
            return sys.get(name1).series(sys.get(name2));
        else
        {
            if (!sys.containsKey(name1))
                System.out.println("Can't find " + name1);
            if (!sys.containsKey(name2))
                System.out.println("Can't find " + name2);
        }
        return -1; //Bao hieu that bai
    }
    public double parallelCircuit(String name1, String name2)   //Mach dien song song
    {
        if (sys.containsKey(name1) && sys.containsKey(name2))
            return sys.get(name1).parallel(sys.get(name2));
        else
        {
            if (!sys.containsKey(name1))
                System.out.println("Can't find " + name1);
            if (!sys.containsKey(name2))
                System.out.println("Can't find " + name2);
        }
        return -1;
    }
    public void delete(String name)
    {
        sys.remove(name);
    }
    public void update(String name)
    {
        MachDien md = findByName(name);
        if (md == null)
        {
            System.out.println("Nothing here");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new name or enter to skip");
        String newName = sc.nextLine().trim();
        System.out.println("Enter a new value or enter to skip");
        String newDienTro = sc.nextLine().trim();
        if (!newName.isEmpty())
        {
            md.name = newName;
        }
        if (!newDienTro.isEmpty())
        {
            md.dienTro = Double.parseDouble(newDienTro); //Convert string to double
        }
        System.out.println("Updated");
    }
}
