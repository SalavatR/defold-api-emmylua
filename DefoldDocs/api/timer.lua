---Timer API documentation
---Timers allow you to set a delay and a callback to be called when the timer completes.
---
---The timers created with this API are updated with the collection timer where they
---are created. If you pause or speed up the collection (using set_time_step) it will
---also affect the new timer.
---@class timer
timer = {}
---Indicates an invalid timer handle
timer.INVALID_TIMER_HANDLE = nil
---You may cancel a timer from inside a timer callback.
---Cancelling a timer that is already executed or cancelled is safe.
---@param handle handlethe timer handle returned by timer.delay()
---@return  trueif the timer was active, false if the timer is already cancelled / complete
function timer.cancel(handle) end
---Adds a timer and returns a unique handle
---
---You may create more timers from inside a timer callback.
---
---Using a delay of 0 will result in a timer that triggers at the next frame just before
---script update functions.
---
---If you want a timer that triggers on each frame, set delay to 0.0f and repeat to true.
---
---Timers created within a script will automatically die when the script is deleted.
---@param delay delaytime interval in seconds
---@param repeat repeattrue = repeat timer until cancel, false = one-shot timer
---@param callback function(self, handle, time_elapsed) timer callback function
---@return  handleidentifier for the create timer, returns timer.INVALID_TIMER_HANDLE if the timer can not be created
function timer.delay(delay, repeat, callback) end

return timer