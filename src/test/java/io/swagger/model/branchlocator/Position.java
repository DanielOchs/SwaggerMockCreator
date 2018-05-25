package io.swagger.model.branchlocator;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Position   {
  
  private Float lat = null;
  private Float lon = null;

  /**
   **/
  public Position lat(Float lat) {
    this.lat = lat;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lat")
  public Float getLat() {
    return lat;
  }
  public void setLat(Float lat) {
    this.lat = lat;
  }

  /**
   **/
  public Position lon(Float lon) {
    this.lon = lon;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lon")
  public Float getLon() {
    return lon;
  }
  public void setLon(Float lon) {
    this.lon = lon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Position position = (Position) o;
    return Objects.equals(lat, position.lat) &&
        Objects.equals(lon, position.lon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

