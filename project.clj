(defproject mvxcvi/merkledag-ref "0.1.1"
  :description "Reference tracking for MerkleDAG graphs."
  :url "https://github.com/greglook/merkledag-ref"
  :license {:name "Public Domain"
            :url "http://unlicense.org/"}

  :aliases
  {"coverage" ["cloverage"]}

  :deploy-branches ["master"]
  :pedantic? :abort

  :plugins
  [[lein-cloverage "1.0.10"]]

  :dependencies
  [[org.clojure/clojure "1.8.0"]
   [clojure-future-spec "1.9.0-beta4"]
   [mvxcvi/multihash "2.0.2"]])
