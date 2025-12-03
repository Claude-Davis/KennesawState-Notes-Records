# Pre-Finalized Ver. of Project
  Post running the previous queries, troubleshooting errors and re-evaluating the EERD relationships.

  This folder holds the pre-finalized schema and 'CREATE TABLE' queries for the final part of the group project.

## Key changes:
  * Offering is now viewed as the supertype of both Product and Service
  * The attribute, contact_person, is now a column for Purchase and not Offering
  * Purchase now only takes the FK of offering_id and not the ids of Service and Product
  * The PKs of Service and Product are FKs of Offering's PK

## To-Do
  * Send the updated schema to group for review
  * Also send an explanation of why I made the stated changes.
