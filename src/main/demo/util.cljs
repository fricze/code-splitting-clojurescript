(ns demo.util
  (:require [reagent.core :as r]
            [shadow.lazy :as lazy]))

(defn lazy-component [loadable]
  (fn [{:keys [fallback] :as props}]
    (let [component (r/atom (or fallback (fn [] nil)))
          _         (-> (lazy/load loadable)
                        (.then (fn [root-el]
                                 (reset! component root-el))))]
      (fn [props]
        [@component props]))))
