/*
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.15.1
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.akhil11101997.nifi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.akhil11101997.nifi.client.model.RegistryClientEntity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RegistryClientsEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class RegistryClientsEntity {
  @SerializedName("registries")
  private List<RegistryClientEntity> registries = null;

  public RegistryClientsEntity registries(List<RegistryClientEntity> registries) {
    this.registries = registries;
    return this;
  }

  public RegistryClientsEntity addRegistriesItem(RegistryClientEntity registriesItem) {
    if (this.registries == null) {
      this.registries = new ArrayList<RegistryClientEntity>();
    }
    this.registries.add(registriesItem);
    return this;
  }

   /**
   * Get registries
   * @return registries
  **/
  @ApiModelProperty(value = "")
  public List<RegistryClientEntity> getRegistries() {
    return registries;
  }

  public void setRegistries(List<RegistryClientEntity> registries) {
    this.registries = registries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryClientsEntity registryClientsEntity = (RegistryClientsEntity) o;
    return Objects.equals(this.registries, registryClientsEntity.registries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryClientsEntity {\n");
    
    sb.append("    registries: ").append(toIndentedString(registries)).append("\n");
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
