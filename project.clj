(defproject
  boot-project
  "0.0.0-SNAPSHOT"
  :repositories
  [["clojars" {:url "https://repo.clojars.org/"}]
   ["maven-central" {:url "https://repo1.maven.org/maven2"}]]
  :dependencies
  [[org.clojure/clojure "1.9.0" :scope "provided"]
   [javax.xml.bind/jaxb-api "2.3.0" :scope "test"]
   [nightlight "2.1.6" :scope "test"]
   [edna "0.3.0"]
   [onetom/boot-lein-generate "0.1.3" :scope "test"]]
  :source-paths
  ["src"]
  :resource-paths
  [])