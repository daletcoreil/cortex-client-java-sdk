

# JobMediatorStatus

Current status of the job as reported by the associated Job Processor if the job is committed.  Returned by the GET /jobs/{jobId} call. <br/>jobOutput is a copy of the output specification that was provided when the job was submitted.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the job as reported by the Job Processor that is handling it, or FAILED if it was rejected (e.g., for missing quota). &lt;br/&gt;Possible transitions - NEW -&gt; QUEUED -&gt; RUNNING -&gt; COMPLETED. |  |
|**statusMessage** | **String** | Last message reported by Job Processor handling this job. |  [optional] |
|**progress** | **Integer** | Progress as reported by the Job Processor. (TBD) |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NEW | &quot;NEW&quot; |
| FAILED | &quot;FAILED&quot; |
| QUEUED | &quot;QUEUED&quot; |
| SCHEDULED | &quot;SCHEDULED&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |



