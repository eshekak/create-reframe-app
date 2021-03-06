(ns my-website.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::name
 (fn [db]
   (:name db)))

(re-frame/reg-sub
 ::home
 (fn [db]
   (:home db)))

(re-frame/reg-sub
 ::active-panel
 (fn [db _]
   (:active-panel db)))
