(defproject mvxcvi/merkledag-ref "0.2.0-SNAPSHOT"
  :description "Reference tracking for MerkleDAG graphs."
  :url "https://github.com/greglook/merkledag-ref"
  :license {:name "Public Domain"
            :url "http://unlicense.org/"}

  :deploy-branches ["master"]
  :pedantic? :abort

  :dependencies
  [[org.clojure/clojure "1.8.0"]
   [clojure-future-spec "1.9.0-alpha14"]
   [mvxcvi/multihash "2.0.1"]])
