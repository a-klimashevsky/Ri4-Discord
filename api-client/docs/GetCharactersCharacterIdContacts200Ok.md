
# GetCharactersCharacterIdContacts200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contactId** | **kotlin.Int** | contact_id integer | 
**contactType** | [**inline**](#ContactTypeEnum) | contact_type string | 
**isBlocked** | **kotlin.Boolean** | Whether this contact is in the blocked list. Note a missing value denotes unknown, not true or false |  [optional]
**isWatched** | **kotlin.Boolean** | Whether this contact is being watched |  [optional]
**labelIds** | **kotlin.Array&lt;kotlin.Long&gt;** | label_ids array |  [optional]
**standing** | **kotlin.Float** | Standing of the contact | 


<a name="ContactTypeEnum"></a>
## Enum: contact_type
Name | Value
---- | -----
contactType | character, corporation, alliance, faction



