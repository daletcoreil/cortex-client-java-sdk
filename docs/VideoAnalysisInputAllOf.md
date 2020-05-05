

# VideoAnalysisInputAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputFile** | [**Locator**](Locator.md) |  | 
**outputLocation** | [**Locator**](Locator.md) |  | 
**dataFilter** | [**List&lt;DataFilterEnum&gt;**](#List&lt;DataFilterEnum&gt;) | Determine which types of AI analyses are to be indexed. |  [optional]
**language** | **String** | Language of the media file to be indexed according to ISO 639-1 Language Name. See https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes.  Used in Job/inputFile |  [optional]
**startOfMaterial** | [**BigDecimal**](BigDecimal.md) | Indicate the timecode of the first frame in the media in seconds.  Generated subtitles start from this time. |  [optional]



## Enum: List&lt;DataFilterEnum&gt;

Name | Value
---- | -----
AUDIOEFFECTS | &quot;audioEffects&quot;
BRANDS | &quot;brands&quot;
FACES | &quot;faces&quot;
KEYWORDS | &quot;keywords&quot;
LABELS | &quot;labels&quot;
OCR | &quot;ocr&quot;
SENTIMENTS | &quot;sentiments&quot;
SHOTS | &quot;shots&quot;
TEXTUALCONTENTMODERATION | &quot;textualContentModeration&quot;
TRANSCRIPT | &quot;transcript&quot;
VISUALCONTENTMODERATION | &quot;visualContentModeration&quot;



