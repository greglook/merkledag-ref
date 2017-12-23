(defproject mvxcvi/merkledag-ref "0.2.1-SNAPSHOT"
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
  [[org.clojure/clojure "1.9.0"]
   [mvxcvi/multihash "2.0.2"]]

  :codox
  {:metadata {:doc/format :markdown}
   :source-uri "https://github.com/greglook/merkledag-ref/blob/master/{filepath}#L{line}"
   :output-path "target/doc/api"})
