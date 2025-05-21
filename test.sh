#!/bin/bash
input=$1
eval "ls $input" # ❌ Command injection
