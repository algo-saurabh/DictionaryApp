package algorithm.string;

public class Pair{
  String value;
  Integer frequency;
  public Integer getFrequency(){
    return frequency;
  }
  public String getValue(){
    return value;
  }
  public Pair(String value,Integer frequency){
    this.value = value;
    this.frequency = frequency;
  }
}
