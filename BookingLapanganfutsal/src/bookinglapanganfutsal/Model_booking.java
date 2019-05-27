package bookinglapanganfutsal;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Model_booking {
    String user="faris";
    int pass=112211;
private DefaultTableModel tabel = new DefaultTableModel();

        public Model_booking(){
            
            getTabel().addColumn("Kode");
            getTabel().addColumn("Tanggal");
            getTabel().addColumn("Waktu");
            getTabel().addColumn("Nama");
            getTabel().addColumn("No HP");
            
        }
    public DefaultTableModel getTable(){
        return tabel;
    }
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
    
    public void Model_booking(){
        int a;
        if("faris".equals(user) && pass==112211){
            
        }
        
        System.exit(0);
    }            

    TableModel getTabel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
