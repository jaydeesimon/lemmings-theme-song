(ns lemmings.core
  (:require [edna.core :as edna]
            [edna.parse :as parse]))






(def piano-keys  [:-1c :-1d :-1e :-1f :-1g :-1a :-1b :c :d :e :f :g :a :b :+1c :+1d :+1e :+1f :+1g :+1a :+1b :+2c])

#_(def music
   [:piano :c :c :g :g :a :a 1/2 :g 1/4 :f :f :e :e :d :d :c])

#_(def music
   [:piano {:tempo 130}
    1/4 :a 1/16 :a :r 1/16 :r 1/16 :a 1/4 :a 1/16 ::g 1/4 :f
    
    :a 1/16 :a :r 1/16 :r 1/16 :a 1/4 :a 1/16 :a# 1/4 :a :g])
;
(def music
  [:piano [1/4 :a] [1/16 :a :r :r :a] [3/16 :a 1/16 :g] [1/4 :f]
   [[1/4 :a] [1/16 :a :r :r :a] [1/12 :a :a# :a] [1/4 :g]]])
  


(defonce state (atom nil))
(swap! state edna/stop!)
; comment this to stop playing:
(reset! state (edna/play! music))

