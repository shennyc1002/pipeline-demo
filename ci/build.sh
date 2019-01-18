#!/bin/bash

set -e
pipeline-demo/gradlew --build-file pipeline-demo/build.gradle build
cp pipeline-demo/build/libs/*.jar build-output/