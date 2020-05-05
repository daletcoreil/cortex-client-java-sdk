

# SpeechToTextInputAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputFile** | [**Locator**](Locator.md) |  | 
**outputLocation** | [**SpeechToTextOutput**](SpeechToTextOutput.md) |  | 
**title** | **String** | Readable name associated to the job when submitted to Media Cortex service. |  [optional]
**language** | **String** | Language of the media file to be indexed according to ISO 639-1 Language Name. See https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes.  Used in Job/inputFile |  [optional]
**startOfMaterial** | [**BigDecimal**](BigDecimal.md) | Indicate the timecode of the first frame in the media in seconds.  Generated subtitles start from this time. |  [optional]
**vocabulary** | [**List&lt;SpeechToTextVocabulary&gt;**](SpeechToTextVocabulary.md) |  |  [optional]



