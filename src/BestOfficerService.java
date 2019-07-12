public class BestOfficerService implements BestEmpolyeeService {
    @Override
    public Employee getResult() {
        return new Officer("Jack", 10);
    }
}
