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
import com.github.akhil11101997.nifi.client.model.RevisionDTO;
import com.github.akhil11101997.nifi.client.model.VersionedFlowSnapshot;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProcessGroupImportEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class ProcessGroupImportEntity {
  @SerializedName("processGroupRevision")
  private RevisionDTO processGroupRevision = null;

  @SerializedName("disconnectedNodeAcknowledged")
  private Boolean disconnectedNodeAcknowledged = null;

  @SerializedName("versionedFlowSnapshot")
  private VersionedFlowSnapshot versionedFlowSnapshot = null;

  public ProcessGroupImportEntity processGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
    return this;
  }

   /**
   * The Revision for the Process Group
   * @return processGroupRevision
  **/
  @ApiModelProperty(value = "The Revision for the Process Group")
  public RevisionDTO getProcessGroupRevision() {
    return processGroupRevision;
  }

  public void setProcessGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
  }

  public ProcessGroupImportEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
    return this;
  }

   /**
   * Acknowledges that this node is disconnected to allow for mutable requests to proceed.
   * @return disconnectedNodeAcknowledged
  **/
  @ApiModelProperty(value = "Acknowledges that this node is disconnected to allow for mutable requests to proceed.")
  public Boolean isDisconnectedNodeAcknowledged() {
    return disconnectedNodeAcknowledged;
  }

  public void setDisconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
  }

  public ProcessGroupImportEntity versionedFlowSnapshot(VersionedFlowSnapshot versionedFlowSnapshot) {
    this.versionedFlowSnapshot = versionedFlowSnapshot;
    return this;
  }

   /**
   * The Versioned Flow Snapshot to import
   * @return versionedFlowSnapshot
  **/
  @ApiModelProperty(value = "The Versioned Flow Snapshot to import")
  public VersionedFlowSnapshot getVersionedFlowSnapshot() {
    return versionedFlowSnapshot;
  }

  public void setVersionedFlowSnapshot(VersionedFlowSnapshot versionedFlowSnapshot) {
    this.versionedFlowSnapshot = versionedFlowSnapshot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessGroupImportEntity processGroupImportEntity = (ProcessGroupImportEntity) o;
    return Objects.equals(this.processGroupRevision, processGroupImportEntity.processGroupRevision) &&
        Objects.equals(this.disconnectedNodeAcknowledged, processGroupImportEntity.disconnectedNodeAcknowledged) &&
        Objects.equals(this.versionedFlowSnapshot, processGroupImportEntity.versionedFlowSnapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processGroupRevision, disconnectedNodeAcknowledged, versionedFlowSnapshot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroupImportEntity {\n");
    
    sb.append("    processGroupRevision: ").append(toIndentedString(processGroupRevision)).append("\n");
    sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
    sb.append("    versionedFlowSnapshot: ").append(toIndentedString(versionedFlowSnapshot)).append("\n");
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
