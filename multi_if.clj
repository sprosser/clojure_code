(defmacro multi-if [test & forms]
  (let [forms (vec (partition-by #{:else :then} forms))
        [then else] (if (= :then (first (get forms 0)))
                      [(get forms 1) (get forms 3)]
                      [(get forms 3) (get forms 1)])]
    `(if ~test
       (do ~@then)
       (do ~@else))))
