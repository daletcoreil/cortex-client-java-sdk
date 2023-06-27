/*
 * Dalet Media Cortex API
 * # Scope Dalet Mediator API allows you to submit long running media jobs managed by Dalet services.  Long running media jobs include: - **Media processing** such as transcoding or automatic QC. - **Automatic metadata extraction** such as automatic speech transcription or face detection.  The Dalet Mediator API is a REST API with typed schema for the payload. # Architecture Job processing is performed on the cloud via dynamic combination of microservices. Dalet Mediator adopts the [EBU MCMA] architecture.  The key objectives of this architecture are to support: - Job management and monitoring - Long running transactions - Event based communication pattern - Service registration and discovery - Horizontal scalability in an elastic manner  The architecture is implemented using the serverless approach - relying on  independent microservices accessible through well documented REST endpoints and sharing a common object model. ## Roles The following services are involved in the processing of media jobs exposed through the Dalet Media Mediator API: - **Mediator**: this is the main entry point to the architecture; this API endpoint supports: 1. Checking authentication using an API key and a token mechanism 2. Verifying quota restrictions before accepting a submitted job 3. Keeping track of usage so that job processing can be tracked and billed 4. Keeping track of jobs metadata as a job repository - **Job Processor**: once a job request is accepted by the mediator, it is assigned to a Job Processor. The Job Processor dispatches the job to an appropriate Job Worker (depending on the job profile and other criteria such as load on the system and cost of operation).  It then keeps track of the progress of the job and its status until completion and possible failures and timeout.  It reports progress to the Mediator through notifications. - **Job Worker**: The Job Worker performs the actual work on the media object, for example, AI metadata extraction (AME) or essence transcoding.  It reports progress to the Job Processor through notifications. - **Service Registry**: The Service Registry keeps track of all active services in the architecture. It is queried by the Mediator and by Processors to discover candidate services to perform jobs.  It is updated whenever a new service is launched or stopped.  The Service Registry also stores the list of all job profiles supported by one of the Job Workers deployed in the architecture. The Dalet Mediator API abstracts away from the complexity of this orchestration and provides a simple endpoint to submit long running jobs and monitor the progress of their execution.  It serves as a facade for the additional technical services for authentication, usage monitoring and service registry.  [EBU MCMA]: /https://tech.ebu.ch/groups/mcma 'EBU MCMA' ## Job Lifecycle ![Job Lifecyle Diagram](./job_lifecycle.svg 'Job Lifecycle Diagram')  ## Authentication To use the Dalet Mediator API - you must obtain an APIKey from Dalet.  This key comes in the form of two parameters: * client ID * secret  Given these two parameters, a client program must first obtain an access token (GET /auth/access-token) and then associate this token to every subsequent calls.  When the token expires, the API will return a 401 error code.  In this case, the client must request a new token and resubmit the request. 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: cortexsupport@dalet.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dalet.mediator.cortex.model;

import java.util.Objects;
import java.util.Arrays;
import com.dalet.mediator.cortex.model.Locator;
import com.dalet.mediator.cortex.model.SpeechToTextOutput;
import com.dalet.mediator.cortex.model.SpeechToTextVocabulary;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.dalet.mediator.cortex.JSON;

/**
 * SpeechToTextInputAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-27T06:13:14.477763Z[Etc/UTC]")
public class SpeechToTextInputAllOf {
  public static final String SERIALIZED_NAME_INPUT_FILE = "inputFile";
  @SerializedName(SERIALIZED_NAME_INPUT_FILE)
  private Locator inputFile;

  public static final String SERIALIZED_NAME_OUTPUT_LOCATION = "outputLocation";
  @SerializedName(SERIALIZED_NAME_OUTPUT_LOCATION)
  private SpeechToTextOutput outputLocation;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_START_OF_MATERIAL = "startOfMaterial";
  @SerializedName(SERIALIZED_NAME_START_OF_MATERIAL)
  private java.lang.Double startOfMaterial;

  public static final String SERIALIZED_NAME_VOCABULARY = "vocabulary";
  @SerializedName(SERIALIZED_NAME_VOCABULARY)
  private List<SpeechToTextVocabulary> vocabulary;

  public SpeechToTextInputAllOf() {
  }

  public SpeechToTextInputAllOf inputFile(Locator inputFile) {
    
    this.inputFile = inputFile;
    return this;
  }

   /**
   * Get inputFile
   * @return inputFile
  **/
  @javax.annotation.Nonnull
  public Locator getInputFile() {
    return inputFile;
  }


  public void setInputFile(Locator inputFile) {
    this.inputFile = inputFile;
  }


  public SpeechToTextInputAllOf outputLocation(SpeechToTextOutput outputLocation) {
    
    this.outputLocation = outputLocation;
    return this;
  }

   /**
   * Get outputLocation
   * @return outputLocation
  **/
  @javax.annotation.Nonnull
  public SpeechToTextOutput getOutputLocation() {
    return outputLocation;
  }


  public void setOutputLocation(SpeechToTextOutput outputLocation) {
    this.outputLocation = outputLocation;
  }


  public SpeechToTextInputAllOf title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Readable name associated to the job when submitted to Media Cortex service.
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public SpeechToTextInputAllOf language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Language of the media file to be indexed according to ISO 639-1 Language Name. See https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes.  Used in Job/inputFile
   * @return language
  **/
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public SpeechToTextInputAllOf startOfMaterial(java.lang.Double startOfMaterial) {
    
    this.startOfMaterial = startOfMaterial;
    return this;
  }

   /**
   * Indicate the timecode of the first frame in the media in seconds.  Generated subtitles start from this time.
   * @return startOfMaterial
  **/
  @javax.annotation.Nullable
  public java.lang.Double getStartOfMaterial() {
    return startOfMaterial;
  }


  public void setStartOfMaterial(java.lang.Double startOfMaterial) {
    this.startOfMaterial = startOfMaterial;
  }


  public SpeechToTextInputAllOf vocabulary(List<SpeechToTextVocabulary> vocabulary) {
    
    this.vocabulary = vocabulary;
    return this;
  }

  public SpeechToTextInputAllOf addVocabularyItem(SpeechToTextVocabulary vocabularyItem) {
    if (this.vocabulary == null) {
      this.vocabulary = new ArrayList<>();
    }
    this.vocabulary.add(vocabularyItem);
    return this;
  }

   /**
   * Get vocabulary
   * @return vocabulary
  **/
  @javax.annotation.Nullable
  public List<SpeechToTextVocabulary> getVocabulary() {
    return vocabulary;
  }


  public void setVocabulary(List<SpeechToTextVocabulary> vocabulary) {
    this.vocabulary = vocabulary;
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
   * @return the SpeechToTextInputAllOf instance itself
   */
  public SpeechToTextInputAllOf putAdditionalProperty(String key, Object value) {
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
    SpeechToTextInputAllOf speechToTextInputAllOf = (SpeechToTextInputAllOf) o;
    return Objects.equals(this.inputFile, speechToTextInputAllOf.inputFile) &&
        Objects.equals(this.outputLocation, speechToTextInputAllOf.outputLocation) &&
        Objects.equals(this.title, speechToTextInputAllOf.title) &&
        Objects.equals(this.language, speechToTextInputAllOf.language) &&
        Objects.equals(this.startOfMaterial, speechToTextInputAllOf.startOfMaterial) &&
        Objects.equals(this.vocabulary, speechToTextInputAllOf.vocabulary)&&
        Objects.equals(this.additionalProperties, speechToTextInputAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputFile, outputLocation, title, language, startOfMaterial, vocabulary, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeechToTextInputAllOf {\n");
    sb.append("    inputFile: ").append(toIndentedString(inputFile)).append("\n");
    sb.append("    outputLocation: ").append(toIndentedString(outputLocation)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    startOfMaterial: ").append(toIndentedString(startOfMaterial)).append("\n");
    sb.append("    vocabulary: ").append(toIndentedString(vocabulary)).append("\n");
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
    openapiFields.add("inputFile");
    openapiFields.add("outputLocation");
    openapiFields.add("title");
    openapiFields.add("language");
    openapiFields.add("startOfMaterial");
    openapiFields.add("vocabulary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("inputFile");
    openapiRequiredFields.add("outputLocation");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SpeechToTextInputAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SpeechToTextInputAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpeechToTextInputAllOf is not found in the empty JSON string", SpeechToTextInputAllOf.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SpeechToTextInputAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `inputFile`
      Locator.validateJsonObject(jsonObj.getAsJsonObject("inputFile"));
      // validate the required field `outputLocation`
      SpeechToTextOutput.validateJsonObject(jsonObj.getAsJsonObject("outputLocation"));
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (jsonObj.get("vocabulary") != null && !jsonObj.get("vocabulary").isJsonNull()) {
        JsonArray jsonArrayvocabulary = jsonObj.getAsJsonArray("vocabulary");
        if (jsonArrayvocabulary != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vocabulary").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vocabulary` to be an array in the JSON string but got `%s`", jsonObj.get("vocabulary").toString()));
          }

          // validate the optional field `vocabulary` (array)
          for (int i = 0; i < jsonArrayvocabulary.size(); i++) {
            SpeechToTextVocabulary.validateJsonObject(jsonArrayvocabulary.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpeechToTextInputAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpeechToTextInputAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpeechToTextInputAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpeechToTextInputAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<SpeechToTextInputAllOf>() {
           @Override
           public void write(JsonWriter out, SpeechToTextInputAllOf value) throws IOException {
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
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SpeechToTextInputAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SpeechToTextInputAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SpeechToTextInputAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpeechToTextInputAllOf
  * @throws IOException if the JSON string is invalid with respect to SpeechToTextInputAllOf
  */
  public static SpeechToTextInputAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpeechToTextInputAllOf.class);
  }

 /**
  * Convert an instance of SpeechToTextInputAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

