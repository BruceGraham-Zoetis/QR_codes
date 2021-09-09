#!/bin/bash

# File: make_openapi_server.sh
# Purpose: Rebuild the openapi server.

# Notes: openapi_server_config.yaml lists files that the generator will use instead of the generated code.

openapi-generator-cli generate -g python-flask -i ../openAPISpecs/openAPISpec.json -o analyzer_app_no_template_files


