package kiemtra.bailuyentap.s2;

public class Bai2 {

    static class Computer {
        private final int hdd;        
        private final int ram;         
        private final boolean isBluetoothEnabled;

        private Computer(ComputerBuilder builder) {
            this.hdd = builder.hdd;
            this.ram = builder.ram;
            this.isBluetoothEnabled = builder.isBluetoothEnabled;
        }

        @Override
        public String toString() {
            return "Computer [HDD=" + hdd + "GB, RAM=" + ram
                    + "GB, Bluetooth=" + isBluetoothEnabled + "]";
        }

        static class ComputerBuilder {
            // Bắt buộc
            private final int hdd;
            private final int ram;
            private boolean isBluetoothEnabled = false;

            public ComputerBuilder(int hdd, int ram) {
                this.hdd = hdd;
                this.ram = ram;
            }

            public ComputerBuilder bluetooth(boolean value) {
                this.isBluetoothEnabled = value;
                return this;   
            }

            public Computer build() {
                return new Computer(this);
            }
        }
    }

    public static void main(String[] args) {
        Computer pcWithBluetooth = new Computer.ComputerBuilder(512, 16)
                .bluetooth(true)
                .build();

        Computer pcNoBluetooth = new Computer.ComputerBuilder(256, 8)
                .build();   
        System.out.println(pcWithBluetooth);  
        System.out.println(pcNoBluetooth);     
    }
}