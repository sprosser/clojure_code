(defmacro multi [test & {:keys [then else]}]
  (let [x test]
  `(if ~x
    (prn ~then)(prn ~else)
)))
