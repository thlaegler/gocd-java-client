package in.ashwanthkumar.gocd.client.types.admin;

import com.google.gson.annotations.SerializedName;

public class EnvironmentVariable
{

  @SerializedName("name")
  private String name;

  @SerializedName("value")
  private String value;
  
  @SerializedName("encrypted_value")
  private String encryptedValue;
  
  @SerializedName("secure")
  private boolean secure;

  public EnvironmentVariable() {
    super();
  }
  
  public EnvironmentVariable(String name, String value, String encryptedValue, boolean secure)
  {
    super();
    this.name = name;
    this.value = value;
    this.encryptedValue = encryptedValue;
    this.secure = secure;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getValue()
  {
    return value;
  }

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getEncryptedValue()
  {
    return encryptedValue;
  }

  public void setEncryptedValue(String encryptedValue)
  {
    this.encryptedValue = encryptedValue;
  }

  public boolean isSecure()
  {
    return secure;
  }

  public void setSecure(boolean secure)
  {
    this.secure = secure;
  }

}
