import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import java.util.Random;

/* @author jivanm
 * PlayerBean
 */

@ManagedBean(name="player")
public class PlayerBean {
    
    Random rand = new Random();
    
    // Player attributes
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
    
    // Attributes skills
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
    
    // Primary Badges
    private String primaryBadge1;
    private String primaryBadge2;
    private String primaryBadge3;
    private String primaryBadge4;
    private String primaryBadge5;
    
    // Secondary Badges
    private String secondaryBadge1;
    private String secondaryBadge2;
    private String secondaryBadge3;
    private String secondaryBadge4;
    private String secondaryBadge5;
    private String secondaryBadge6;
    private String secondaryBadge7;
    private String secondaryBadge8;
    private String secondaryBadge9;
    
    // Badge names
    private String primaryBadgeName1;
    private String primaryBadgeName2;
    private String primaryBadgeName3;
    private String primaryBadgeName4;
    private String primaryBadgeName5;
    
    private String secondaryBadgeName1;
    private String secondaryBadgeName2;
    private String secondaryBadgeName3;
    private String secondaryBadgeName4;
    private String secondaryBadgeName5;
    private String secondaryBadgeName6;
    private String secondaryBadgeName7;
    private String secondaryBadgeName8;
    private String secondaryBadgeName9;    
    
    // Lists
    List<String> positionOptions;
    List<Integer> heightOptions;
    List<Integer> weightOptions;
    List<Double> shoulderWidthOptions;
    List<String> archetypeOptions;
    List<String> collegeOptions;
    List<String> teamOptions;
    
    // Getters
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

    public String getPrimaryBadge1() {
        return primaryBadge1;
    }

    public String getPrimaryBadge2() {
        return primaryBadge2;
    }

    public String getPrimaryBadge3() {
        return primaryBadge3;
    }

    public String getPrimaryBadge4() {
        return primaryBadge4;
    }

    public String getPrimaryBadge5() {
        return primaryBadge5;
    }

    public String getSecondaryBadge1() {
        return secondaryBadge1;
    }

    public String getSecondaryBadge2() {
        return secondaryBadge2;
    }

    public String getSecondaryBadge3() {
        return secondaryBadge3;
    }

    public String getSecondaryBadge4() {
        return secondaryBadge4;
    }

    public String getSecondaryBadge5() {
        return secondaryBadge5;
    }

    public String getSecondaryBadge6() {
        return secondaryBadge6;
    }

    public String getSecondaryBadge7() {
        return secondaryBadge7;
    }

    public String getSecondaryBadge8() {
        return secondaryBadge8;
    }

    public String getSecondaryBadge9() {
        return secondaryBadge9;
    }

    public String getPrimaryBadgeName1() {
        return primaryBadgeName1;
    }

    public String getPrimaryBadgeName2() {
        return primaryBadgeName2;
    }

    public String getPrimaryBadgeName3() {
        return primaryBadgeName3;
    }

    public String getPrimaryBadgeName4() {
        return primaryBadgeName4;
    }

    public String getPrimaryBadgeName5() {
        return primaryBadgeName5;
    }

    public String getSecondaryBadgeName1() {
        return secondaryBadgeName1;
    }

    public String getSecondaryBadgeName2() {
        return secondaryBadgeName2;
    }

    public String getSecondaryBadgeName3() {
        return secondaryBadgeName3;
    }

    public String getSecondaryBadgeName4() {
        return secondaryBadgeName4;
    }

    public String getSecondaryBadgeName5() {
        return secondaryBadgeName5;
    }

    public String getSecondaryBadgeName6() {
        return secondaryBadgeName6;
    }

    public String getSecondaryBadgeName7() {
        return secondaryBadgeName7;
    }

    public String getSecondaryBadgeName8() {
        return secondaryBadgeName8;
    }

    public String getSecondaryBadgeName9() {
        return secondaryBadgeName9;
    }
    
    
    
    // Setters
    public void setFirstname(String firstname) {
        this.firstname = firstname.toUpperCase();
    }

    public void setLastname(String lastname) {
        this.lastname = lastname.toUpperCase();
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
    
    // Set Archetype One Badges and Skills
    public void setArchetypeOne(String archetypeOne) {
        this.archetypeOne = archetypeOne;
        if(archetypeOne.equals("Passing & Ball-Handling")){
            setBallHandling(96);
            setPassing(90);
            setMidRange(85);
            setLayups(80);
            setDunks(71);
            setThreePt(77);
            setBlocks(25);
            setSteals(50);
            setPrimaryBadge1("resources/img/playmaker_elite.png");
            setPrimaryBadgeName1("Ankle Breaker");
            setPrimaryBadge2("resources/img/playmaker_elite.png");
            setPrimaryBadgeName2("Dimer");
            setPrimaryBadge3("resources/img/playmaker_elite.png");
            setPrimaryBadgeName3("Pick and Roll Maestro");
            setPrimaryBadge4("resources/img/outsideshooter_gold.png");
            setPrimaryBadgeName4("Catch and Shoot");
            setPrimaryBadge5("resources/img/playmaker_elite.png");
            setPrimaryBadgeName5("Ankle Breaker");
        }
        else if (archetypeOne.equals("Rebounding")){
            setRebounding(99);
            setBlocks(89);
            setStrength(99);
            setPrimaryBadge1("resources/img/rebound_elite.png");
            setPrimaryBadgeName1("Hustle Rebounder");
            setPrimaryBadge2("resources/img/insideshooter_gold.png");
            setPrimaryBadgeName2("Relentless Finisher");
            setPrimaryBadge3("resources/img/athlete_elite.png");
            setPrimaryBadgeName3("Brick Wall");
            setPrimaryBadge4("resources/img/outsideshooter_gold.png");
            setPrimaryBadgeName4("Catch and Shoot");
            setPrimaryBadge5("resources/img/playmaker_elite.png");
            setPrimaryBadgeName5("Ankle Breaker");
        }
        else if (archetypeOne.equals("Shot Creating")){
            setMidRange(96);
            setPrimaryBadge1("resources/img/playmaker_elite.png");
            setPrimaryBadgeName1("Ankle Breaker");
            setPrimaryBadge2("resources/img/playmaker_elite.png");
            setPrimaryBadgeName2("Dimer");
            setPrimaryBadge3("resources/img/playmaker_elite.png");
            setPrimaryBadgeName3("Pick and Roll Maestro");
            setPrimaryBadge4("resources/img/outsideshooter_gold.png");
            setPrimaryBadgeName4("Catch and Shoot");
            setPrimaryBadge5("resources/img/playmaker_elite.png");
            setPrimaryBadgeName5("Ankle Breaker");
        }
        else if (archetypeOne.equals("3PT Shooting")){
            setPrimaryBadge1("resources/img/playmaker_elite.png");
            setPrimaryBadgeName1("Ankle Breaker");
            setPrimaryBadge2("resources/img/playmaker_elite.png");
            setPrimaryBadgeName2("Dimer");
            setPrimaryBadge3("resources/img/playmaker_elite.png");
            setPrimaryBadgeName3("Pick and Roll Maestro");
            setPrimaryBadge4("resources/img/outsideshooter_gold.png");
            setPrimaryBadgeName4("Catch and Shoot");
            setPrimaryBadge5("resources/img/playmaker_elite.png");
            setPrimaryBadgeName5("Ankle Breaker");
        }
        else if (archetypeOne.equals("Driving & Finishing")){   
            setDunks(99);
            setPrimaryBadge1("resources/img/playmaker_elite.png");
            setPrimaryBadgeName1("Ankle Breaker");
            setPrimaryBadge2("resources/img/playmaker_elite.png");
            setPrimaryBadgeName2("Dimer");
            setPrimaryBadge3("resources/img/playmaker_elite.png");
            setPrimaryBadgeName3("Pick and Roll Maestro");
            setPrimaryBadge4("resources/img/outsideshooter_gold.png");
            setPrimaryBadgeName4("Catch and Shoot");
            setPrimaryBadge5("resources/img/playmaker_elite.png");
            setPrimaryBadgeName5("Ankle Breaker");            
        }
        else if (archetypeOne.equals("Post Scoring")){
            setPrimaryBadge1("resources/img/playmaker_elite.png");
            setPrimaryBadgeName1("Ankle Breaker");
            setPrimaryBadge2("resources/img/playmaker_elite.png");
            setPrimaryBadgeName2("Dimer");
            setPrimaryBadge3("resources/img/playmaker_elite.png");
            setPrimaryBadgeName3("Pick and Roll Maestro");
            setPrimaryBadge4("resources/img/outsideshooter_gold.png");
            setPrimaryBadgeName4("Catch and Shoot");
            setPrimaryBadge5("resources/img/playmaker_elite.png");
            setPrimaryBadgeName5("Ankle Breaker");
        }
        else if (archetypeOne.equals("Defending")){
            setPrimaryBadge1("resources/img/defender_elite.png");
            setPrimaryBadgeName1("Defensive Stopper");
            setPrimaryBadge2("resources/img/playmaker_elite.png");
            setPrimaryBadgeName2("Pick Pocket");
            setPrimaryBadge3("resources/img/playmaker_elite.png");
            setPrimaryBadgeName3("Rim Protector");
            setPrimaryBadge4("resources/img/outsideshooter_gold.png");
            setPrimaryBadgeName4("Corner Specialist");
            setPrimaryBadge5("resources/img/playmaker_elite.png");
            setPrimaryBadgeName5("Chase Down Artist");
        }
    }

    
    // Set Archetype Two Badges and Skills
    public void setArchetypeTwo(String archetypeTwo) {
        this.archetypeTwo = archetypeTwo;
        if(archetypeTwo.equals("Passing & Ball-Handling")){
            setBallHandling(96);
            
            setSecondaryBadge1("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName1("Ankle Breaker");
            setSecondaryBadge2("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName2("Glue Hands");
            setSecondaryBadge3("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName3("Glue Hands");
            setSecondaryBadge4("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName4("Glue Hands");
            setSecondaryBadge5("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName5("Glue Hands");
            setSecondaryBadge6("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName6("Glue Hands");
            setSecondaryBadge7("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName7("Glue Hands");
            setSecondaryBadge8("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName8("Glue Hands");
            setSecondaryBadge9("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName9("Glue Hands");
        }
        else if (archetypeTwo.equals("Rebounding")){
            setRebounding(99);
            setBlocks(89);
            setStrength(99);
            
            setSecondaryBadge1("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName1("Break Starter");
            setSecondaryBadge2("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName2("Glue Hands");
            setSecondaryBadge3("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName3("Glue Hands");
            setSecondaryBadge4("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName4("Glue Hands");
            setSecondaryBadge5("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName5("Glue Hands");
            setSecondaryBadge6("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName6("Glue Hands");
            setSecondaryBadge7("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName7("Glue Hands");
            setSecondaryBadge8("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName8("Glue Hands");
            setSecondaryBadge9("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName9("Glue Hands");
        }
        else if (archetypeTwo.equals("Shot Creating")){
            setMidRange(96);
            
            setSecondaryBadge1("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName1("Ankle Breaker");
            setSecondaryBadge2("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName2("Glue Hands");
            setSecondaryBadge3("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName3("Glue Hands");
            setSecondaryBadge4("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName4("Glue Hands");
            setSecondaryBadge5("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName5("Glue Hands");
            setSecondaryBadge6("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName6("Glue Hands");
            setSecondaryBadge7("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName7("Glue Hands");
            setSecondaryBadge8("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName8("Glue Hands");
            setSecondaryBadge9("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName9("Tireless Scorer");
        }
        else if (archetypeTwo.equals("3PT Shooting")){
            setSecondaryBadge1("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName1("Ankle Breaker");
            setSecondaryBadge2("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName2("Glue Hands");
            setSecondaryBadge3("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName3("Glue Hands");
            setSecondaryBadge4("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName4("Glue Hands");
            setSecondaryBadge5("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName5("Glue Hands");
            setSecondaryBadge6("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName6("Glue Hands");
            setSecondaryBadge7("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName7("Glue Hands");
            setSecondaryBadge8("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName8("Glue Hands");
            setSecondaryBadge9("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName9("Glue Hands");   
        }
        else if (archetypeTwo.equals("Driving & Finishing")){   
            setDunks(99);
            setPostOffense(65);
            
            setSecondaryBadge1("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName1("Ankle Breaker");
            setSecondaryBadge2("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName2("Glue Hands");
            setSecondaryBadge3("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName3("Glue Hands");
            setSecondaryBadge4("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName4("Glue Hands");
            setSecondaryBadge5("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName5("Glue Hands");
            setSecondaryBadge6("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName6("Glue Hands");
            setSecondaryBadge7("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName7("Glue Hands");
            setSecondaryBadge8("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName8("Glue Hands");
            setSecondaryBadge9("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName9("Glue Hands");
            
        }
        else if (archetypeTwo.equals("Post Scoring")){
            setSecondaryBadge1("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName1("Ankle Breaker");
            setSecondaryBadge2("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName2("Glue Hands");
            setSecondaryBadge3("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName3("Glue Hands");
            setSecondaryBadge4("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName4("Glue Hands");
            setSecondaryBadge5("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName5("Glue Hands");
            setSecondaryBadge6("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName6("Glue Hands");
            setSecondaryBadge7("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName7("Glue Hands");
            setSecondaryBadge8("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName8("Glue Hands");
            setSecondaryBadge9("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName9("Glue Hands");
        }
        else if (archetypeTwo.equals("Defending")){
            setSecondaryBadge1("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName1("Ankle Breaker");
            setSecondaryBadge2("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName2("Glue Hands");
            setSecondaryBadge3("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName3("Glue Hands");
            setSecondaryBadge4("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName4("Glue Hands");
            setSecondaryBadge5("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName5("Glue Hands");
            setSecondaryBadge6("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName6("Glue Hands");
            setSecondaryBadge7("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName7("Glue Hands");
            setSecondaryBadge8("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName8("Glue Hands");
            setSecondaryBadge9("resources/img/playmaker_bronze.png");
            setSecondaryBadgeName9("Glue Hands");
        }
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

    public void setPrimaryBadge1(String primaryBadge1) {
        this.primaryBadge1 = primaryBadge1;
    }

    public void setPrimaryBadge2(String primaryBadge2) {
        this.primaryBadge2 = primaryBadge2;
    }

    public void setPrimaryBadge3(String primaryBadge3) {
        this.primaryBadge3 = primaryBadge3;
    }

    public void setPrimaryBadge4(String primaryBadge4) {
        this.primaryBadge4 = primaryBadge4;
    }

    public void setPrimaryBadge5(String primaryBadge5) {
        this.primaryBadge5 = primaryBadge5;
    }

    public void setSecondaryBadge1(String secondaryBadge1) {
        this.secondaryBadge1 = secondaryBadge1;
    }

    public void setSecondaryBadge2(String secondaryBadge2) {
        this.secondaryBadge2 = secondaryBadge2;
    }

    public void setSecondaryBadge3(String secondaryBadge3) {
        this.secondaryBadge3 = secondaryBadge3;
    }

    public void setSecondaryBadge4(String secondaryBadge4) {
        this.secondaryBadge4 = secondaryBadge4;
    }

    public void setSecondaryBadge5(String secondaryBadge5) {
        this.secondaryBadge5 = secondaryBadge5;
    }

    public void setSecondaryBadge6(String secondaryBadge6) {
        this.secondaryBadge6 = secondaryBadge6;
    }

    public void setSecondaryBadge7(String secondaryBadge7) {
        this.secondaryBadge7 = secondaryBadge7;
    }

    public void setSecondaryBadge8(String secondaryBadge8) {
        this.secondaryBadge8 = secondaryBadge8;
    }

    public void setSecondaryBadge9(String secondaryBadge9) {
        this.secondaryBadge9 = secondaryBadge9;
    }

    public void setPrimaryBadgeName1(String primaryBadgeName1) {
        this.primaryBadgeName1 = primaryBadgeName1;
    }

    public void setPrimaryBadgeName2(String primaryBadgeName2) {
        this.primaryBadgeName2 = primaryBadgeName2;
    }

    public void setPrimaryBadgeName3(String primaryBadgeName3) {
        this.primaryBadgeName3 = primaryBadgeName3;
    }

    public void setPrimaryBadgeName4(String primaryBadgeName4) {
        this.primaryBadgeName4 = primaryBadgeName4;
    }

    public void setPrimaryBadgeName5(String primaryBadgeName5) {
        this.primaryBadgeName5 = primaryBadgeName5;
    }

    public void setSecondaryBadgeName1(String secondaryBadgeName1) {
        this.secondaryBadgeName1 = secondaryBadgeName1;
    }

    public void setSecondaryBadgeName2(String secondaryBadgeName2) {
        this.secondaryBadgeName2 = secondaryBadgeName2;
    }

    public void setSecondaryBadgeName3(String secondaryBadgeName3) {
        this.secondaryBadgeName3 = secondaryBadgeName3;
    }

    public void setSecondaryBadgeName4(String secondaryBadgeName4) {
        this.secondaryBadgeName4 = secondaryBadgeName4;
    }

    public void setSecondaryBadgeName5(String secondaryBadgeName5) {
        this.secondaryBadgeName5 = secondaryBadgeName5;
    }

    public void setSecondaryBadgeName6(String secondaryBadgeName6) {
        this.secondaryBadgeName6 = secondaryBadgeName6;
    }

    public void setSecondaryBadgeName7(String secondaryBadgeName7) {
        this.secondaryBadgeName7 = secondaryBadgeName7;
    }

    public void setSecondaryBadgeName8(String secondaryBadgeName8) {
        this.secondaryBadgeName8 = secondaryBadgeName8;
    }

    public void setSecondaryBadgeName9(String secondaryBadgeName9) {
        this.secondaryBadgeName9 = secondaryBadgeName9;
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