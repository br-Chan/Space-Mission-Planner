public class LunarMission extends Mission implements Prototype {

    @Override
    public String getDetails() {
        return "Lunar Mission";
    }

    @Override
    public Prototype clone() {
        return new LunarMission();
    }

}
