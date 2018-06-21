import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/* @author jivanm
 * PlayerBean
 */

@ManagedBean(name="player")
public class PlayerBean {
    // player attributes
    private String firstname;
    private String lastname;
    private String position;
    private int height;
    private int weight;
    private double shoulderWidth;
    private String archetypeOne;
    private String archetypeTwo;
    private String college;
    private String favoriteTeam;
    
    // attributes skills
    private int layups;
    private int dunks;
    private int midRange;
    private int threePt;
    private int ballHandling;
    private int passing;
    private int postOffense;
    private int rebounding;
    private int steals;
    private int blocks;
    private int vertical;
    private int lateralQuickness;
    private int speed;
    private int acceleration;
    private int strength;
    private int stamina;   
    
    
    // Lists
    List<String> positionOptions;
    List<Integer> heightOptions;
    List<Integer> weightOptions;
    List<Double> shoulderWidthOptions;
    List<String> archetypeOptions;
    List<String> collegeOptions;
    List<String> teamOptions;
    
    // Get
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPosition() {
        return position;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public double getShoulderWidth() {
        return shoulderWidth;
    }

    public String getArchetypeOne() {
        return archetypeOne;
    }

    public String getArchetypeTwo() {
        return archetypeTwo;
    }

    public String getCollege() {
        return college;
    }

    public String getFavoriteTeam() {
        return favoriteTeam;
    }

    public List<String> getPositionOptions() {
        return positionOptions;
    }

    public List<Integer> getHeightOptions() {
        return heightOptions;
    }

    public List<Integer> getWeightOptions() {
        return weightOptions;
    }

    public List<Double> getShoulderWidthOptions() {
        return shoulderWidthOptions;
    }

    public List<String> getArchetypeOptions() {
        return archetypeOptions;
    }

    public List<String> getCollegeOptions() {
        return collegeOptions;
    }

    public List<String> getTeamOptions() {
        return teamOptions;
    }

    public int getLayups() {
        return layups;
    }

    public int getDunks() {
        return dunks;
    }

    public int getMidRange() {
        return midRange;
    }

    public int getThreePt() {
        return threePt;
    }

    public int getBallHandling() {
        return ballHandling;
    }

    public int getPassing() {
        return passing;
    }

    public int getPostOffense() {
        return postOffense;
    }

    public int getRebounding() {
        return rebounding;
    }

    public int getSteals() {
        return steals;
    }

    public int getBlocks() {
        return blocks;
    }

    public int getVertical() {
        return vertical;
    }

    public int getLateralQuickness() {
        return lateralQuickness;
    }
    
    public int getSpeed(){
        return speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getStrength() {
        return strength;
    }

    public int getStamina() {
        return stamina;
    }           
    
    // Set
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setShoulderWidth(double shoulderWidth) {
        this.shoulderWidth = shoulderWidth;
    }

    public void setArchetypeOne(String archetypeOne) {
        this.archetypeOne = archetypeOne;
        if(archetypeOne.equals("Passing & Ball-Handling")){
            setBallHandling(96);
            setPassing(90);
        }else if (archetypeOne.equals("Rebounding")){
        }else if (archetypeOne.equals("Shot Creating")){
        }else if (archetypeOne.equals("3PT Shooting")){
        }else if (archetypeOne.equals("Driving & Finishing")){   
        }else if (archetypeOne.equals("Post Scoring")){
        }else if (archetypeOne.equals("Defending")){
        }else if (archetypeOne.equals("Rebounding")){
        }
    }

    public void setArchetypeTwo(String archetypeTwo) {
        this.archetypeTwo = archetypeTwo;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setFavoriteTeam(String favoriteTeam) {
        this.favoriteTeam = favoriteTeam;
    }

    public void setLayups(int layups) {
        this.layups = layups;
    }

    public void setDunks(int dunks) {
        this.dunks = dunks;
    }

    public void setMidRange(int midRange) {
        this.midRange = midRange;
    }

    public void setThreePt(int threePt) {
        this.threePt = threePt;
    }

    public void setBallHandling(int ballHandling) {
        this.ballHandling = ballHandling;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public void setPostOffense(int postOffense) {
        this.postOffense = postOffense;
    }

    public void setRebounding(int rebounding) {
        this.rebounding = rebounding;
    }

    public void setSteals(int steals) {
        this.steals = steals;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    public void setLateralQuickness(int lateralQuickness) {
        this.lateralQuickness = lateralQuickness;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;        
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
      
    
    public PlayerBean(){
        positionOptions = new ArrayList<String>();
            positionOptions.add("PG");
            positionOptions.add("SG");
            positionOptions.add("SF");
            positionOptions.add("PF");
            positionOptions.add("C");
            
        heightOptions = new ArrayList<Integer>();
            heightOptions.add(5);
            heightOptions.add(6);
            heightOptions.add(7);
        
        weightOptions = new ArrayList<Integer>();
            weightOptions.add(175);
            weightOptions.add(180);
            weightOptions.add(190);
            weightOptions.add(200);
            weightOptions.add(225);
            weightOptions.add(250);
            weightOptions.add(275);
            weightOptions.add(300);
            weightOptions.add(325);
            weightOptions.add(350);
            weightOptions.add(375);
            
        shoulderWidthOptions = new ArrayList<Double>();
            shoulderWidthOptions.add(22.0);
            shoulderWidthOptions.add(23.0);
            shoulderWidthOptions.add(24.0);
            shoulderWidthOptions.add(25.0);
            shoulderWidthOptions.add(26.0);
            shoulderWidthOptions.add(27.0);
            shoulderWidthOptions.add(28.0);
            shoulderWidthOptions.add(28.5);
            
        archetypeOptions = new ArrayList<String>();
            archetypeOptions.add("Passing & Ball-Handling");
            archetypeOptions.add("Shot Creating");
            archetypeOptions.add("3PT Shooting");
            archetypeOptions.add("Driving & Finishing");
            archetypeOptions.add("Post Scoring");
            archetypeOptions.add("Defending");
            archetypeOptions.add("Rebounding");
            
        collegeOptions = new ArrayList<String>();
            collegeOptions.add("Villanova");
            collegeOptions.add("Virginia");
            collegeOptions.add("Kansas");
            collegeOptions.add("Xavier");
            collegeOptions.add("Duke");
            collegeOptions.add("North Carolina");
            collegeOptions.add("Cincinnati");
            collegeOptions.add("Michigan");
            collegeOptions.add("Purdue");
            collegeOptions.add("Tennessee");
            
            collegeOptions.add("Clemson");
            collegeOptions.add("Kentucky");
            collegeOptions.add("Nevada");
            collegeOptions.add("Loyola Chicago");
            collegeOptions.add("Michigan St.");
            collegeOptions.add("Auburn");
            collegeOptions.add("Arizona");
            collegeOptions.add("Texas Tech");
            collegeOptions.add("Ohio St.");
            collegeOptions.add("Houston");
            
            collegeOptions.add("Wichita St.");
            collegeOptions.add("Gonzaga");
            collegeOptions.add("Rhode Island");
            collegeOptions.add("West Virginia");
            collegeOptions.add("Texas A&M");
            collegeOptions.add("Buffalo");
            collegeOptions.add("TCU");
            collegeOptions.add("Miami");
            collegeOptions.add("California");
            collegeOptions.add("UCLA");
            
        teamOptions = new ArrayList<String>();
            teamOptions.add("Atlanta Hawks");
            teamOptions.add("Boston Celtics");
            teamOptions.add("Brooklyn Nets");
            teamOptions.add("Charlotte Hornets");
            teamOptions.add("Chicago Bulls");
            teamOptions.add("Cleveland Cavaliers");
            teamOptions.add("Dallas Mavericks");
            teamOptions.add("Denver Nuggets");
            teamOptions.add("Detroit Pistons");
            teamOptions.add("Golden State Warriors");
            
            teamOptions.add("Indiana Pacers");
            teamOptions.add("Los Angeles Clippers");
            teamOptions.add("Los Angeles Lakers");
            teamOptions.add("Milwaukee Bucks");
            teamOptions.add("Memphis Grizzlies");
            teamOptions.add("Miami Heat");
            teamOptions.add("Minnesota Timberwolves");
            teamOptions.add("New Orleans Pelicans");
            teamOptions.add("New York Knicks");
            teamOptions.add("Oklahoma City Thunder");
            
            teamOptions.add("Orlando Magic");
            teamOptions.add("Philadelphia Sixers");
            teamOptions.add("Phoenix Suns");
            teamOptions.add("Portland Trail Blazers");
            teamOptions.add("Sacramento Kings");
            teamOptions.add("San Antonio Spurs");
            teamOptions.add("Toronto Raptors");
            teamOptions.add("Utah Jazz");
            teamOptions.add("Washington Wizards");
    }
    
    
    
    
}
