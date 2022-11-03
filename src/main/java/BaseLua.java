import models.ParameterModel;

public class BaseLua {
    public static String BASE = 
            "------@meta\n" +
            "---\n" +
            "---\n" +
            "---@class vector3\n" +
            "---@field x number\n" +
            "---@field y number\n" +
            "---@field z number\n" +
            "---@operator sub(vector3): vector3\n" +
            "---@operator add(vector3): vector3\n" +
            "\n" +
            "---@class vector4\n" +
            "---@field x number\n" +
            "---@field y number\n" +
            "---@field z number\n" +
            "---@field w number\n" +
            "---@operator sub(vector4): vector4\n" +
            "---@operator add(vector4): vector4\n" +
            "\n" +
            "---@class quaternion\n" +
            "---@field x number\n" +
            "---@field y number\n" +
            "---@field z number\n" +
            "---@field w number\n" +
            "\n" +
            "---@alias quat quaternion\n" +
            "\n" +
            "---@class url string|hash\n" +
            "---@field socket string|hash\n" +
            "---@field path string|hash\n" +
            "---@field fragment string|hash\n" +
            "\n" +
            "---@alias hash userdata\n" +
            "---@alias constant userdata\n" +
            "---@alias bool boolean\n" +
            "---@alias float number\n" +
            "---@alias object userdata\n" +
            "---@alias matrix4 userdata\n" +
            "---@alias node userdata\n" +
            "\n" +
            "--mb use number instead of vector4\n" +
            "---@alias vector vector4\n" +
            "\n" +
            "--luasocket\n" +
            "---@alias master userdata\n" +
            "---@alias unconnected userdata\n" +
            "---@alias client userdata\n" +
            "\n" +
            "--render\n" +
            "---@alias constant_buffer userdata\n" +
            "---@alias render_target userdata\n" +
            "---@alias predicate userdata\n" +
            "\n" +
            "--- Calls error if the value of its argument `v` is false (i.e., **nil** or\n" +
            "--- **false**); otherwise, returns all its arguments. In case of error,\n" +
            "--- `message` is the error object; when absent, it defaults to \"assertion\n" +
            "--- failed!\"\n" +
            "---@generic ANY\n" +
            "---@overload fun(v:any):any\n" +
            "---@param v ANY\n" +
            "---@param message string\n" +
            "---@return ANY\n" +
            "function assert(v,message) return v end\n"+
            "\n" +
            "---@param self object\n"+
            "function init(self) end\n" +
            "\n" +
            "---@param self object\n" +
            "---@param dt number\n" +
            "function update(self, dt) end\n" +
            "\n" +
            "---@param self object\n" +
            "---@param message_id hash\n" +
            "---@param message table\n" +
            "---@param sender url\n" +
            "function on_message(self, message_id, message, sender) end\n" +
            "\n" +
            "---@param self object\n" +
            "---@param action_id hash\n" +
            "---@param action table\n" +
            "function on_input(self, action_id, action) end\n" +
            "\n" +
            "---@param self object\n" +
            "function final(self) end;\n";
}
