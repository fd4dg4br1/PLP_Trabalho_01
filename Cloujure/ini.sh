#!/bin/bash
docker run --rm -v $(pwd):/app -w /app clojure clojure -M pilha.clj