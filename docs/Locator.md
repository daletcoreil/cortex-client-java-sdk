

# Locator

Generic description of a file location according to the EBU FIMS specification.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**awsS3Bucket** | **String** | Name of an AWS S3 bucket | 
**awsS3Key** | **String** | Name of a file in the AWS S3 bucket. For example, name of media file to be indexed in an Input Locator or name of a JSON file in an Output Locator. | 
**httpEndpoint** | **String** | Public URL to access the file in the bucket. Must be computed using the AWS SDK method &#x60;GeneratePresignedUrl&#x60; | 



