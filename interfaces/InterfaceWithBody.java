package interfaces;

public interface InterfaceWithBody {
    void hi();
    default int hello(){
        return 0;
    }
}
