(ns lemmings.core
  (:require [edna.core :as edna]))

(def tempo' 145)
(def repeat-n 3)

(def bass
  [:electric-bass-pick {:tempo tempo'}
   (repeat repeat-n [[1 :-2f]
                     [1 :-2c]
                     [1 :-2d]
                     [1 :-3a]
                     [1 :-3a#]
                     [1 :-2c]
                     [1/4 :-1f 1/4 :-2c 1/4 :-2a 1/4 :-2f]
                     [1 :-1c]])])

(def melody
  [:midi-electric-grand-piano {:tempo tempo'}
   (repeat repeat-n
           [[1/4 :a]
            [1/16 :a 1/16 :r 1/16 :r 1/16 :a]
            [3/16 :a 1/16 :g]
            [1/4 :f]
            [1/4 :a]
            [1/16 :a 1/16 :r 1/16 :r 1/16 :a]
            [1/12 :a :a# :a]
            [1/4 :g]
            [1/4 :a]
            [1/16 :a 1/16 :r 1/16 :r 1/16 :a]
            [3/16 :a 1/16 :a#]
            [1/4 :+c]
            [4/4 :e]
            []
            []
            []
            [1/4 :d]
            [1/16 :d 1/16 :r 1/16 :r 1/16 :d]
            [3/16 :d 1/16 :e]
            [1/4 :f]
            [1/4 :e]
            [1/16 :e 1/16 :r 1/16 :r 1/16 :e]
            [3/16 :e 1/16 :f]
            [1/4 :g]
            [1/4 :r]
            [1/4 :+f]
            [1/8 :r 1/8 :+f]
            [1/4 :r]
            [1/4 :r]
            [1/4 :+g]
            [1/8 :r 1/8 :+g]
            [1/4 :r]])])

(def music
  #{bass melody})


(defonce state (atom nil))
(swap! state edna/stop!)
; comment this to stop playing:
(reset! state (edna/play! music))

