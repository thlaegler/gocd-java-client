package in.ashwanthkumar.gocd.client.types.admin.templates;

import com.google.gson.annotations.SerializedName;

import in.ashwanthkumar.gocd.client.types.admin.EmbeddedLinks;

public class EmbeddedTemplatesResponse
{

  @SerializedName("_links")
  private EmbeddedLinks links;

  @SerializedName("_embedded")
  private EmbeddedTemplates embedded;

  public EmbeddedLinks getLinks()
  {
    return links;
  }

  public void setLinks(EmbeddedLinks links)
  {
    this.links = links;
  }

  public EmbeddedTemplates getEmbedded()
  {
    return embedded;
  }

  public void setEmbedded(EmbeddedTemplates embedded)
  {
    this.embedded = embedded;
  }

}
