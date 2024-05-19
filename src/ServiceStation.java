public class ServiceStation {

    public void check(Serviceable... transports) {
        for (Serviceable transport : transports){
            transport.service();
        }
    }
}
