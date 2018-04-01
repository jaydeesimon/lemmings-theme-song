(set-env!
  :source-paths #{"src"}
  :dependencies '[[org.clojure/clojure "1.9.0" :scope "provided"]
                  [javax.xml.bind/jaxb-api "2.3.0" :scope "test"] ; necessary for Java 9 compatibility
                  [nightlight "RELEASE" :scope "test"]
                  [edna "0.3.0"]
                  [onetom/boot-lein-generate "0.1.3" :scope "test"]])

(require
  '[edna.core]
  '[nightlight.boot :refer [nightlight]]
  '[boot.lein])

(boot.lein/generate)

(deftask run []
  (comp
    (wait)
    (with-pass-thru _
      (require 'lemmings.core))
    (nightlight :port 4000)))

