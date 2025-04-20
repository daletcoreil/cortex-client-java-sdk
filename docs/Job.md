

# Job


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobType** | [**JobTypeEnum**](#JobTypeEnum) |  |  [optional] |
|**jobProfile** | [**JobProfileEnum**](#JobProfileEnum) | Define what type of job is to be executed on the media object. |  [optional] |
|**regionName** | **String** | If defined, require job to be run on a Worker instance that can serve any of the regions, else can run on any Worker instance. If no service is available for the requested regions, the job fails. |  [optional] |
|**maxRegionLatency** | **Integer** | If defined, require job to be run on a Worker instance that can access the requested region with a latency less than this value |  [optional] |
|**jobInput** | [**JobInput**](JobInput.md) |  |  [optional] |



## Enum: JobTypeEnum

| Name | Value |
|---- | -----|
| AIJOB | &quot;AIJob&quot; |
| MEDIAPROCESSINGJOB | &quot;MediaProcessingJob&quot; |
| FACERECOGNITIONJOB | &quot;FaceRecognitionJob&quot; |



## Enum: JobProfileEnum

| Name | Value |
|---- | -----|
| MEDIACORTEXVIDEOANALYSIS | &quot;MediaCortexVideoAnalysis&quot; |
| MEDIACORTEXSPEECHTOTEXT | &quot;MediaCortexSpeechToText&quot; |
| EXTRACTFACES | &quot;ExtractFaces&quot; |
| CLUSTERFACES | &quot;ClusterFaces&quot; |
| SEARCHFACES | &quot;SearchFaces&quot; |



