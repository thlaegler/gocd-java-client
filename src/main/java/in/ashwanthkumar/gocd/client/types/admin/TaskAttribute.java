package in.ashwanthkumar.gocd.client.types.admin;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class TaskAttribute
{

  @SerializedName("runIf")
  private List<String> runIf;

  @SerializedName("command")
  private String command;

  @SerializedName("arguments")
  private List<String> arguments;

  @SerializedName("working_directory")
  private String workingDirectory;

  @SerializedName("on_cancel")
  private Task onCancel;

  public TaskAttribute()
  {
    super();
  }

  public TaskAttribute(List<String> runIf, String command, List<String> arguments, String workingDirectory, Task onCancel)
  {
    super();
    this.runIf = runIf;
    this.command = command;
    this.arguments = arguments;
    this.workingDirectory = workingDirectory;
    this.onCancel = onCancel;
  }

  public List<String> getRunIf()
  {
    return runIf;
  }

  public void setRunIf(List<String> runIf)
  {
    this.runIf = runIf;
  }

  public String getCommand()
  {
    return command;
  }

  public void setCommand(String command)
  {
    this.command = command;
  }

  public List<String> getArguments()
  {
    return arguments;
  }

  public void setArguments(List<String> arguments)
  {
    this.arguments = arguments;
  }

  public String getWorkingDirectory()
  {
    return workingDirectory;
  }

  public void setWorkingDirectory(String workingDirectory)
  {
    this.workingDirectory = workingDirectory;
  }

  public Task getOnCancel()
  {
    return onCancel;
  }

  public void setOnCancel(Task onCancel)
  {
    this.onCancel = onCancel;
  }

}
