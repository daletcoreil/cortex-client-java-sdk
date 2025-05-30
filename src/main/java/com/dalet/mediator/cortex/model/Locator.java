/*
 * Dalet Media Cortex API
 * # Scope Dalet Mediator API allows you to submit long running media jobs managed by Dalet services.  Long running media jobs include: - **Media processing** such as transcoding or automatic QC. - **Automatic metadata extraction** such as automatic speech transcription or face detection.  The Dalet Mediator API is a REST API with typed schema for the payload. # Architecture Job processing is performed on the cloud via dynamic combination of microservices. Dalet Mediator adopts the [EBU MCMA] architecture.  The key objectives of this architecture are to support: - Job management and monitoring - Long running transactions - Event based communication pattern - Service registration and discovery - Horizontal scalability in an elastic manner  The architecture is implemented using the serverless approach - relying on  independent microservices accessible through well documented REST endpoints and sharing a common object model. ## Roles The following services are involved in the processing of media jobs exposed through the Dalet Media Mediator API: - **Mediator**: this is the main entry point to the architecture; this API endpoint supports: 1. Checking authentication using an API key and a token mechanism 2. Verifying quota restrictions before accepting a submitted job 3. Keeping track of usage so that job processing can be tracked and billed 4. Keeping track of jobs metadata as a job repository - **Job Processor**: once a job request is accepted by the mediator, it is assigned to a Job Processor. The Job Processor dispatches the job to an appropriate Job Worker (depending on the job profile and other criteria such as load on the system and cost of operation).  It then keeps track of the progress of the job and its status until completion and possible failures and timeout.  It reports progress to the Mediator through notifications. - **Job Worker**: The Job Worker performs the actual work on the media object, for example, AI metadata extraction (AME) or essence transcoding.  It reports progress to the Job Processor through notifications. - **Service Registry**: The Service Registry keeps track of all active services in the architecture. It is queried by the Mediator and by Processors to discover candidate services to perform jobs.  It is updated whenever a new service is launched or stopped.  The Service Registry also stores the list of all job profiles supported by one of the Job Workers deployed in the architecture. The Dalet Mediator API abstracts away from the complexity of this orchestration and provides a simple endpoint to submit long running jobs and monitor the progress of their execution.  It serves as a facade for the additional technical services for authentication, usage monitoring and service registry.  [EBU MCMA]: /https://tech.ebu.ch/groups/mcma 'EBU MCMA' ## Job Lifecycle ![Job Lifecyle Diagram](./job_lifecycle.svg 'Job Lifecycle Diagram')  ## Authentication To use the Dalet Mediator API - you must obtain an APIKey from Dalet.  This key comes in the form of two parameters: * client ID * secret  Given these two parameters, a client program must first obtain an access token (GET /auth/access-token) and then associate this token to every subsequent calls.  When the token expires, the API will return a 401 error code.  In this case, the client must request a new token and resubmit the request. 
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: cortexsupport@dalet.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dalet.mediator.cortex.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.dalet.mediator.cortex.JSON;

/**
 * Generic description of a file location according to the EBU FIMS specification.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:59:05.988996Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class Locator {
  public static final String SERIALIZED_NAME_AWS_S3_BUCKET = "awsS3Bucket";
  @SerializedName(SERIALIZED_NAME_AWS_S3_BUCKET)
  @javax.annotation.Nonnull
  private String awsS3Bucket;

  public static final String SERIALIZED_NAME_AWS_S3_KEY = "awsS3Key";
  @SerializedName(SERIALIZED_NAME_AWS_S3_KEY)
  @javax.annotation.Nonnull
  private String awsS3Key;

  public static final String SERIALIZED_NAME_HTTP_ENDPOINT = "httpEndpoint";
  @SerializedName(SERIALIZED_NAME_HTTP_ENDPOINT)
  @javax.annotation.Nonnull
  private String httpEndpoint;

  public Locator() {
  }

  public Locator awsS3Bucket(@javax.annotation.Nonnull String awsS3Bucket) {
    this.awsS3Bucket = awsS3Bucket;
    return this;
  }

  /**
   * Name of an AWS S3 bucket
   * @return awsS3Bucket
   */
  @javax.annotation.Nonnull
  public String getAwsS3Bucket() {
    return awsS3Bucket;
  }

  public void setAwsS3Bucket(@javax.annotation.Nonnull String awsS3Bucket) {
    this.awsS3Bucket = awsS3Bucket;
  }


  public Locator awsS3Key(@javax.annotation.Nonnull String awsS3Key) {
    this.awsS3Key = awsS3Key;
    return this;
  }

  /**
   * Name of a file in the AWS S3 bucket. For example, name of media file to be indexed in an Input Locator or name of a JSON file in an Output Locator.
   * @return awsS3Key
   */
  @javax.annotation.Nonnull
  public String getAwsS3Key() {
    return awsS3Key;
  }

  public void setAwsS3Key(@javax.annotation.Nonnull String awsS3Key) {
    this.awsS3Key = awsS3Key;
  }


  public Locator httpEndpoint(@javax.annotation.Nonnull String httpEndpoint) {
    this.httpEndpoint = httpEndpoint;
    return this;
  }

  /**
   * Public URL to access the file in the bucket. Must be computed using the AWS SDK method &#x60;GeneratePresignedUrl&#x60;
   * @return httpEndpoint
   */
  @javax.annotation.Nonnull
  public String getHttpEndpoint() {
    return httpEndpoint;
  }

  public void setHttpEndpoint(@javax.annotation.Nonnull String httpEndpoint) {
    this.httpEndpoint = httpEndpoint;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Locator instance itself
   */
  public Locator putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Locator locator = (Locator) o;
    return Objects.equals(this.awsS3Bucket, locator.awsS3Bucket) &&
        Objects.equals(this.awsS3Key, locator.awsS3Key) &&
        Objects.equals(this.httpEndpoint, locator.httpEndpoint)&&
        Objects.equals(this.additionalProperties, locator.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsS3Bucket, awsS3Key, httpEndpoint, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Locator {\n");
    sb.append("    awsS3Bucket: ").append(toIndentedString(awsS3Bucket)).append("\n");
    sb.append("    awsS3Key: ").append(toIndentedString(awsS3Key)).append("\n");
    sb.append("    httpEndpoint: ").append(toIndentedString(httpEndpoint)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("awsS3Bucket");
    openapiFields.add("awsS3Key");
    openapiFields.add("httpEndpoint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("awsS3Bucket");
    openapiRequiredFields.add("awsS3Key");
    openapiRequiredFields.add("httpEndpoint");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Locator
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Locator.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Locator is not found in the empty JSON string", Locator.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Locator.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("awsS3Bucket").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `awsS3Bucket` to be a primitive type in the JSON string but got `%s`", jsonObj.get("awsS3Bucket").toString()));
      }
      if (!jsonObj.get("awsS3Key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `awsS3Key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("awsS3Key").toString()));
      }
      if (!jsonObj.get("httpEndpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpEndpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpEndpoint").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Locator.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Locator' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Locator> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Locator.class));

       return (TypeAdapter<T>) new TypeAdapter<Locator>() {
           @Override
           public void write(JsonWriter out, Locator value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Locator read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Locator instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Locator given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Locator
   * @throws IOException if the JSON string is invalid with respect to Locator
   */
  public static Locator fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Locator.class);
  }

  /**
   * Convert an instance of Locator to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

